package com.ls.sbmdemo.action;

import com.ls.sbmdemo.entity.User;
import com.ls.sbmdemo.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private IUserService userService;


    //增加
    @RequestMapping("/add")
    @ResponseBody
    public int  add(User user){



        return userService.addUser(user);
    }

    //删
    @RequestMapping("/delete")
    @ResponseBody
    public int delete(String id){
        return  userService.delete(id);
    }
    //改
    @RequestMapping("/update")
    @ResponseBody
    public int update(User user){



        return userService.updateUser(user);
    }

   //全部查询
   @RequestMapping("/findAll")
   @ResponseBody
    public List<User> queryUsers(){



        return  userService.queryList();

    }
 //单条查询

    @RequestMapping("/findById")
    @ResponseBody
     public  User findById(String id){





        return userService.findById(id);
     }






}
