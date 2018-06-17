package com.ls.sbmdemo.dao;

import com.ls.sbmdemo.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {


    @Insert("INSERT INTO user(id,userNumber,userPwd,userName) VALUES(#{id}, #{userNumber}, #{userPwd}, #{userName})")
    int addUser(User user);




}
