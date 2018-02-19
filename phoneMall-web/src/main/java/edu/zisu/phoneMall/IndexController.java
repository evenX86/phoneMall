package edu.zisu.phoneMall;

import edu.zisu.phoneMall.chilent.UserService;
import edu.zisu.phoneMall.user.User;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserById", method = {RequestMethod.POST, RequestMethod.GET})
    public String getUserById(HttpServletRequest request, Model model) {
        System.out.println(request);
        //参数
        Integer userId = StringUtils.isNoneBlank(request.getParameter("userId")) ? Integer.parseInt(request.getParameter("userId")) : 1;
        model.addAttribute("user", "1");
        return "test";
    }
    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request, Model model) {
        return "login";
    }
    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.GET})
    public String register(HttpServletRequest request, Model model) {
        return "html/register";
    }

    @RequestMapping(value = "/doLogin", method = {RequestMethod.POST})
    public String doLogin(HttpServletRequest request, Model model) {
        log.error("进入登录Action");
        String userName = request.getParameter("username");
        String passwd = request.getParameter("password");
        log.error("登录信息: " + userName + " 密码: " + passwd);
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(passwd)) return "login";
        User user = new User();
        user.setUserName(userName);
        user.setUserPassWd(passwd);
        User authUser = userService.getUserByNameAndPasswd(user);
        if (authUser == null) return "login";
        model.addAttribute("userName",authUser.getUserName());
        model.addAttribute("userType",authUser.getUserType());
        log.error("登录成功: " + userName);
        //TODO 处理登录信息
        return "test";
    }
    @RequestMapping(value = "/doRegister", method = {RequestMethod.POST, RequestMethod.GET})
    public String doRegister(HttpServletRequest request, Model model) {
        //TODO 处理注册信息
        return "index";
    }
}
