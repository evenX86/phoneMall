package edu.zisu.phoneMall;

import edu.zisu.phoneMall.chilent.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    UserService userService;
    /**
     * description: 测试 spring mvc
     * author: leeyom
     * date: 2017-07-31 10:47
     * Copyright © 2017 by leeyom
     */
    @RequestMapping(value = "/getUserById", method = {RequestMethod.POST, RequestMethod.GET})
    public String getUserById(HttpServletRequest request, Model model) {
        //参数
        Integer userId = StringUtils.isNoneBlank(request.getParameter("userId")) ? Integer.parseInt(request.getParameter("userId")) : 1;
        //User user = userService.getUserById(userId);
        model.addAttribute("user", "1");
        return "test";
    }
}
