package com.lzc.vuetest.mapper;

import com.lzc.vuetest.entity.User;
import com.lzc.vuetest.utils.IBaseMapper;

import java.util.List;

public interface UserMapper {
    /**
     * 更具用户名密码查询
     */
    List<User> selectByNameAndPassword(User user);

    /**
     * 直接联表查询
     */
    User findUserByName(String username);

    /**
     * 根据userId查询
     * @param userId userId
     * @return
     */
    User selectByUId(String userId);
}