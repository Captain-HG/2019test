package com.lzc.vuetest.service;

import com.lzc.vuetest.model.User;

import javax.servlet.http.HttpSession;

public interface UserServcie {
    /** 用户登录*/
    String userLogin(User user, HttpSession session);
}
