package com.ls.sbmdemo.action;

import com.ls.sbmdemo.entity.User;
import com.ls.sbmdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private IUserService userService;



    @RequestMapping("/add")
    @ResponseBody
    public String  add(User user){


       int a=userService.addUser(user);
        return a+"";








    }





}
