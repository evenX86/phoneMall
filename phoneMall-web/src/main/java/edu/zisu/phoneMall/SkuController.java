package edu.zisu.phoneMall;

import edu.zisu.phoneMall.service.SkuService;
import edu.zisu.phoneMall.sku.Phone;
import edu.zisu.phoneMall.user.User;
import edu.zisu.phoneMall.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SkuController {
    private static final Logger log = LoggerFactory.getLogger(SkuController.class);
    @Autowired
    private SkuService skuService;

    @RequestMapping(value = "/search", method = {RequestMethod.POST, RequestMethod.GET})
    public String search(HttpServletRequest request, Model model, HttpSession session) {
        try {
            String keyword = (String) request.getAttribute("keyword");
            if (StringUtils.isBlank(keyword)) return "sku/category";
            return "sku/search";
        } catch (Exception e) {
            log.error("搜索手机信息出错",e);
            return "error";
        }
    }


    @RequestMapping(value = "/category", method = {RequestMethod.POST, RequestMethod.GET})
    public String category(HttpServletRequest request, Model model, HttpSession session) {
        try {
            //String keyword = (String) request.getAttribute("keyword");
            //if (StringUtils.isBlank(keyword)) return "html/category";
            return "sku/category";
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }


    @RequestMapping(value = "/addSku", method = {RequestMethod.POST, RequestMethod.GET})
    public String addSku(HttpServletRequest request, Model model, HttpSession session) {
        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                model.addAttribute("errMsg","权限不足");
                return "error";
            }
            return "sku/addSku";
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }

    @RequestMapping(value = "/updateSku", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateSku(HttpServletRequest request, Model model, HttpSession session) {
        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                model.addAttribute("errMsg","用户未登录或权限不足");
                return "error";
            }
            Long skuId = Long.valueOf(request.getParameter("skuId"));
            Phone phone = skuService.querySku(skuId);
            log.error("修改sku: " + JsonUtils.toString(phone));
            if (phone == null) {
                model.addAttribute("errMsg","修改SKU为空");
                return "error";
            }
            model.addAttribute(phone);
            return "sku/updateSku";
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }

    @RequestMapping(value = "/doUpdateSku", method = {RequestMethod.POST, RequestMethod.GET})
    public String doUpdateSku(HttpServletRequest request, Model model, HttpSession session) {
        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                model.addAttribute("errMsg","用户未登录或权限不足");
                return "error";
            }
            Long skuId = Long.valueOf(request.getParameter("skuId"));
            String skuName = request.getParameter("skuName");
            String skuBrand = request.getParameter("skuBrand");
            String skuRam = request.getParameter("skuRam");
            String skuRom = request.getParameter("skuRom");
            String screenSize = request.getParameter("screenSize");
            String phonePrice = request.getParameter("phonePrice");
            String skuStock = request.getParameter("skuStock");
            String skuPic = request.getParameter("skuPic");
            Phone phone = prepareSku(skuId,skuName,skuBrand,skuRam,skuRom,screenSize,Integer.parseInt(phonePrice),
                    Integer.parseInt(skuStock),skuPic,user.getUserName());
            log.error("录入手机信息: " + JsonUtils.toString(phone));
            skuService.updateSku(phone);
            return skuList(request,model,session);
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }

    @RequestMapping(value = "/saveSku", method = {RequestMethod.POST, RequestMethod.GET})
    public String saveSku(HttpServletRequest request, Model model, HttpSession session) {
        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                return "error";
            }
            String skuName = request.getParameter("skuName");
            String skuBrand = request.getParameter("skuBrand");
            String skuRam = request.getParameter("skuRam");
            String skuRom = request.getParameter("skuRom");
            String screenSize = request.getParameter("screenSize");
            String phonePrice = request.getParameter("phonePrice");
            String skuStock = request.getParameter("skuStock");
            String skuPic = request.getParameter("skuPic");
            Phone phone = prepareSku(-1L,skuName,skuBrand,skuRam,skuRom,screenSize,Integer.parseInt(phonePrice),
                    Integer.parseInt(skuStock),skuPic,user.getUserName());
            log.error("录入手机信息: " + JsonUtils.toString(phone));
            skuService.insertSku(phone);
            return skuList(request,model,session);
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }


    @RequestMapping(value = "/skuList", method = {RequestMethod.POST, RequestMethod.GET})
    public String skuList(HttpServletRequest request, Model model, HttpSession session) {
        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                model.addAttribute("errMsg","用户未登录或权限不足");
                return "error";
            }
            List<Phone> phoneList = skuService.querySkuList();
            model.addAttribute(phoneList);
            return "sku/skuList";
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }


    private Phone prepareSku(Long skuId,String skuName, String skuBrand, String skuRam, String skuRom, String screenSize,
                             Integer phonePrice, Integer skuStock, String skuPic,String userName) {
        Map<String,String> configParams = new HashMap<>();
        configParams.put("ram",skuRam);
        configParams.put("rom",skuRom);
        configParams.put("screenSize",screenSize);
        Phone phone = new Phone(skuId,skuName,skuBrand,phonePrice,skuStock,skuPic, JsonUtils.toString(configParams),userName,userName);
        return phone;
    }


}
