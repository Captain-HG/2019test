package com.lzc.vuetest.service;


import com.lzc.vuetest.entity.User;

import java.util.List;


public interface UserServcie {
    /**
     * 根据用户名和密码查询
     */
    List<User> findByNameAndPassword(User user);
    /** 根据userId获取user*/
    User selectByUId(String userId);
}
