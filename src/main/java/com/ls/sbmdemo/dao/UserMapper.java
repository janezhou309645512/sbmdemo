package com.ls.sbmdemo.dao;

import com.ls.sbmdemo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    //增加
    @Insert("INSERT INTO user(id,userNumber,userPwd,userName) VALUES(#{id}, #{userNumber}, #{userPwd}, #{userName})")
    int addUser(User user);
    //删除
    @Delete("DELETE FROM user WHERE id =#{id}")
    int  delete(String id);

    //改
    @Update("UPDATE user SET userNumber=#{userNumber},userPwd=#{userPwd} WHERE id =#{id}")
    int updateUser(User user);

    //查询全部记录
    @Select("select * from user")
    @Results({
            @Result(property = "id", column = "id"),

            @Result(property = "userNumber", column = "userNumber"),

            @Result(property = "userPwd", column = "userPwd"),
            @Result(property = "userName", column = "userName")})

    public List<User> queryList();


    //查询单条记录
    @Select("SELECT * FROM USER WHERE id= #{id}")
    @Results({
            @Result(property = "id", column = "id"),

            @Result(property = "userNumber", column = "userNumber"),

            @Result(property = "userPwd", column = "userPwd"),
            @Result(property = "userName", column = "userName")})
           User findById(String id);












}
