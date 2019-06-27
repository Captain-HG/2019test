package com.lzc.vuetest.service.impl;


import com.lzc.vuetest.entity.User;
import com.lzc.vuetest.mapper.UserMapper;
import com.lzc.vuetest.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/14
 * @Description
 */
@Service
public class UserServiceImpl implements UserServcie {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findByNameAndPassword(User user) {
        return userMapper.selectByNameAndPassword(user);
    }

    @Override
    public User selectByUId(String userId) {
        return userMapper.selectByUId(userId);
    }


}
