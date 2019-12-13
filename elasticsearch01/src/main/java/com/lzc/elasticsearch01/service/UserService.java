package com.lzc.elasticsearch01.service;

import com.lzc.elasticsearch01.model.User;

import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2019/7/1
 * @Description 对user的逻辑处理
 */
public interface UserService {
    /**
     * 保存一个user
     * @param user
     */
    void save(User user);

    /**
     * 查询所有
     * @return 所有数据
     */
    Iterable<User> selectAll();

}
