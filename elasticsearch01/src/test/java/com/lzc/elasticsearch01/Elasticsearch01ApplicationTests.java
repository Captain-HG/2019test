package com.lzc.elasticsearch01;

import com.lzc.elasticsearch01.model.User;
import com.lzc.elasticsearch01.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Elasticsearch01ApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
//        User user = new User();
//        user.setId("2");
//        user.setName("da");
//        user.setPassword("fds");
//        userService.save(user);
        Iterable<User> users = userService.selectAll();
        if(users.iterator().hasNext()){
            System.out.println(users.iterator().next().getId());
        }
    }

}
