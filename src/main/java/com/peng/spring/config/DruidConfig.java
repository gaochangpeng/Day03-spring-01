package com.peng.spring.config;

import com.peng.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    @Configuration
        ssm项目       XML+注解
        springboot   java config+注解
 */
@Configuration  // 不是spring的，而是springboot的
public class DruidConfig {

    @Bean
    public User user(){
        User user = new User();
        user.setUsername("Rom");
        return user;
    }
}
