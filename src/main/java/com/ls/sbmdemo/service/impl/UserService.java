package com.ls.sbmdemo.service.impl;

import com.ls.sbmdemo.dao.UserMapper;
import com.ls.sbmdemo.entity.User;
import com.ls.sbmdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {
 @Autowired
 private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int delete(String id) {
        return userMapper.delete(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }
}
