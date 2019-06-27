package comlzc.testservice01.controller;

import comlzc.testservice01.model.User;
import comlzc.testservice01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/8
 * @Description
 */
@Controller()
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;
    @RequestMapping("/test01")
    public String test01(Model model){
        model.addAttribute("data","hellow lzc");
        return "test01";
    }
    @RequestMapping("/selectUserById/{uId}")
    @ResponseBody
    public User test02(@PathVariable(value = "uId") Integer uId,Model model){
        return userService.selectUserById(uId);
    }
}
