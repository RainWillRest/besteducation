package com.education.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by sun on 2019/8/8.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/registe")
    public String registe(){
        return "registe";
    }
    @RequestMapping("/login")
    public  String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        usernamePasswordToken.setUsername(username);
        usernamePasswordToken.setPassword(password.toCharArray());
        Subject subject = SecurityUtils.getSubject();
        subject.login(usernamePasswordToken);
        return "login";
    }


}
