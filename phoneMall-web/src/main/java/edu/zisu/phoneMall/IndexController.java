package edu.zisu.phoneMall;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping(value = "/getUserById", method = {RequestMethod.POST, RequestMethod.GET})
    public String getUserById(HttpServletRequest request, Model model) {
        System.out.println(request);
        //参数
        Integer userId = StringUtils.isNoneBlank(request.getParameter("userId")) ? Integer.parseInt(request.getParameter("userId")) : 1;
        model.addAttribute("user", "1");
        return "test";
    }
}
