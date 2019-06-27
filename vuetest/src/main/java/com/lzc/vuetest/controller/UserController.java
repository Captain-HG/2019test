package com.lzc.vuetest.controller;

import com.lzc.vuetest.entity.User;
import com.lzc.vuetest.service.SecurityService;
import com.lzc.vuetest.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/14
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    UserServcie userServcie;

    @RequestMapping("/getname")
    @ResponseBody
    public String getUserName( @RequestBody Map map){
//        System.out.println(userId);
       String userId = (String) map.get("userId");
        User user = userServcie.selectByUId(userId);
        return user.getUsername();
    }

    @RequestMapping("/test01")
    @ResponseBody
    public String test01() {
        return "mmp";
    }


    @RequestMapping("/userlogin")
    @ResponseBody
    public String login(@RequestBody User user) {
        System.out.println("user" + user);
        //  System.out.println(user);

        return "login";
    }

}
