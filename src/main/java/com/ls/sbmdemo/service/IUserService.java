package com.ls.sbmdemo.service;

import com.ls.sbmdemo.entity.User;

import java.util.List;

/**
 * 实现用户增删查改的
 */
public interface IUserService {
    public int addUser(User user);
    int  delete(String id);
    int updateUser(User user);
    public List<User> queryList();

    User findById(String id);


}
