package com.yue.springtest;

import com.yue.springtest.ioc.bean.Fox;
import com.yue.springtest.ioc.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    // @Bean
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Object user = context.getBean("user");
        System.out.println(user);
    }

    //FactoryBean
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //ReentrantLock
        System.out.println(context.getBean("myFactoryBean"));
        //MyFactoryBean
        System.out.println(context.getBean("&myFactoryBean"));
    }

    //@Import
    @Test
    public void test3(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(Fox.class));
        System.out.println(context.getBean("fox"));
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //通过容器获取BeanFactory，既是工厂又是注册器
        DefaultListableBeanFactory defaultListableBeanFactory = context.getDefaultListableBeanFactory();
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Fox.class);
        defaultListableBeanFactory.registerBeanDefinition("fox",rootBeanDefinition);
        System.out.println(context.getBean(Fox.class));
    }

}
