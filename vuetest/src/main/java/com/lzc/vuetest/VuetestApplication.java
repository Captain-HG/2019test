package com.lzc.vuetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 既然已经写到安全了，那么就写完整把
 * spring boot + spring security + jwt + mysql + mybatis + redis
 */
@SpringBootApplication
@MapperScan("com.lzc.vuetest.mapper")
public class VuetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuetestApplication.class, args);
    }

}
