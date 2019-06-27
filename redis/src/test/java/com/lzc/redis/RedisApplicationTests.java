package com.lzc.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Action;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    public void contextLoads() {
           //stringRedisTemplate.opsForValue().set("1","2");
//        String s = stringRedisTemplate.opsForValue().get("1");
//        System.out.println(s);
       redisTemplate.opsForValue().set("1",123,200);

//        Object o = redisTemplate.opsForValue().get("1");
//        System.out.println(o);
    }

}
