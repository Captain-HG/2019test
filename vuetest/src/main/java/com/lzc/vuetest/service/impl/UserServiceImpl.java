package com.lzc.vuetest.service.impl;

import com.lzc.vuetest.config.Dict;
import com.lzc.vuetest.config.ErrorDict;
import com.lzc.vuetest.model.User;
import com.lzc.vuetest.respority.UserRespority;
import com.lzc.vuetest.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/14
 * @Description
 */
@Service
public class UserServiceImpl implements UserServcie {
    @Autowired
    UserRespority userRespority;

    @Override
    public String userLogin(User user, HttpSession session) {
        List<User> userList = userRespority.selectByNameAndPassword(user);
        if (userList==null&&userList.size()<=0){
            return ErrorDict.LOGIN_ERROR;
        }else {
            session.setAttribute(Dict.SESSION_USER,userList.get(0));
            return Dict.LOGIN_SUCCESS;
        }

    }
}
