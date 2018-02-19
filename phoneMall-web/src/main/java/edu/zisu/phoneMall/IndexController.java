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
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String Index(HttpServletRequest request, Model model,HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        if (user == null) {
            log.error("session中无用户信息");
            return "login";
        }
        //参数
        model.addAttribute("user", user);
        return "../index";
    }

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
    public String doLogin(HttpServletRequest request, Model model, HttpSession httpSession) {
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
        httpSession.setAttribute("user",authUser);
        model.addAttribute(user);
        log.error("登录成功: " + userName);
        return "../index";
    }
    @RequestMapping(value = "/doRegister", method = {RequestMethod.POST, RequestMethod.GET})
    public String doRegister(HttpServletRequest request, Model model) {
        //TODO 处理注册信息
        return "login";
    }
}
