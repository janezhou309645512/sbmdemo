package com.ls.sbmdemo.service.impl;

import com.ls.sbmdemo.dao.UserDao;
import com.ls.sbmdemo.entity.User;
import com.ls.sbmdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {
 @Autowired
 private UserDao userDao;
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
