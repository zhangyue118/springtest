package com.yue.springtest;

import com.yue.springtest.ioc.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringtestApplicationTests {

    @Test
    void contextLoads() {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean("user");

    }

}
