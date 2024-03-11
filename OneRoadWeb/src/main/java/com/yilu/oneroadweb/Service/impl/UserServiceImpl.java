package com.yilu.oneroadweb.Service.impl;

import com.yilu.oneroadweb.Dao.UserMapper;
import com.yilu.oneroadweb.Service.UserService;
import com.yilu.oneroadweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(User user) {
        userMapper.set(user);
    }

    @Override
    public User login(User user) {
        return userMapper.get(user);
    }
}
