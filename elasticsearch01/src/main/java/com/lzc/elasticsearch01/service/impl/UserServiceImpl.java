package com.lzc.elasticsearch01.service.impl;

import com.lzc.elasticsearch01.dao.UserDao;
import com.lzc.elasticsearch01.model.User;
import com.lzc.elasticsearch01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2019/7/1
 * @Description userService的实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public Iterable<User> selectAll() {
        Iterable<User> users = userDao.findAll();
        return users;
    }
}
