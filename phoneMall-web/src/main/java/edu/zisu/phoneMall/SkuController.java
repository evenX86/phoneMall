package edu.zisu.phoneMall;

import edu.zisu.phoneMall.chilent.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SkuController {
    private static final Logger log = LoggerFactory.getLogger(SkuController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/search", method = {RequestMethod.POST, RequestMethod.GET})
    public String search(HttpServletRequest request, Model model, HttpSession session) {
        try {
            String keyword = (String) request.getAttribute("keyword");
            if (StringUtils.isBlank(keyword)) return "html/category";
            return "html/search";
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
            return "html/category";
        } catch (Exception e) {
            log.error("访问手机列表出错",e);
            return "error";
        }
    }

}
