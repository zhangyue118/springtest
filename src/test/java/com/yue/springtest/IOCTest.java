package com.yue.springtest;

import com.yue.springtest.ioc.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    // @Bean
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Object user = context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean("myFactoryBean"));
        System.out.println(context.getBean("&myFactoryBean"));
    }

}
