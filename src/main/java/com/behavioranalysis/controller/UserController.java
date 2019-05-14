package com.behavioranalysis.controller;

import com.behavioranalysis.pojo.User;
import com.behavioranalysis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam(name = "Username") String uaccount,
                        @RequestParam(name = "Password") String upassword,
                        HttpSession session, ModelAndView mv) {
        System.out.println("进入登录controller了！！！！！！");
        User loginUser = userService.login(uaccount, upassword);
        if (loginUser != null) {
            /**
             * 这里要将警告信息和用户信息封装到ModelAndView里面
             */
            session.setAttribute("loginUser", loginUser);
            // 设置逻辑视图名称
            mv.setViewName("main-page");
            return mv;
        } else {
            mv.addObject("loginErrMsg", "Input error! Re login");
            mv.setViewName("index");
            return mv;
        }
    }
}
