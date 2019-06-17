package com.lzc.vuetest.controller;

import com.lzc.vuetest.config.ErrorDict;
import com.lzc.vuetest.model.User;
import com.lzc.vuetest.service.UserServcie;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/14
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    UserServcie userServcie;

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(@RequestBody(required = false) User user,@RequestBody(required = false) String name) {
        System.out.println(name);
        System.out.println("mmp");
        System.out.println("user:"+user);
//        if (user!=null) {
//            System.out.println(user);
//            String s = userServcie.userLogin(user, session);
//            return s;
//        }
//        else {
//            return ErrorDict.LOGIN_ERROR;
//        }
        return "100";
    }
}
