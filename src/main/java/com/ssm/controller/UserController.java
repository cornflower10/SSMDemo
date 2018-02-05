package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.IUserService;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/addUser")
    public String toIndex(HttpServletRequest request) {
//        String uname=request.getParameter("name");
//        String passwd=request.getParameter("passwd");
        User user =new User();
        user.setUserName("uname");
        user.setPassWord("passwd");
        userService.addUser(user);
        return "success";

    }
}