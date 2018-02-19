package edu.zisu.phoneMall;

import edu.zisu.phoneMall.chilent.UserService;
import edu.zisu.phoneMall.user.User;
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
public class UserInfoController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userInfo", method = {RequestMethod.POST, RequestMethod.GET})
    public String userInfo(HttpServletRequest request, Model model,HttpSession session) {
        try {
            User user = (User) session.getAttribute("user");
            log.error("用户个人信息: " + user.getUserType());
            model.addAttribute(user);
            return "html/userInfo";
        } catch (Exception e) {
            log.error("访问个人信息出错",e);
            return "error";
        }
    }
}