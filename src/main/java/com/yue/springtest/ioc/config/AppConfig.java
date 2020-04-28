package com.yue.springtest.ioc.config;

import com.yue.springtest.ioc.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.yue.springtest")
@Configuration
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }

}
