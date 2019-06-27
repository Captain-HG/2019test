package com.lzc.vuetest;

import com.lzc.vuetest.entity.User;
import com.lzc.vuetest.mapper.UserMapper;
import com.lzc.vuetest.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VuetestApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
        User userByName = userMapper.findUserByName("123");

        System.out.println(userByName.getRoles().get(0).getName());
    }

    @Test
    public void testRedis() {
        String s = redisUtil.get("eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE1NjIwNDk5MDIsInN1YiI6IjEyMyIsImNyZWF0ZWQiOjE1NjE0NDUxMDIxNTJ9.o2Gu7THSdnlNgAholA-B5B3-rxrFp74i4RsOnjai556biEsZe-pYkENyu0qFFdRNJEHRIqx_1fAwag7LrpnnZQ");
        System.out.println(s);
    }

}
