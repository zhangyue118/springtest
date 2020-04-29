package com.yue.springtest.ioc.config;

import com.yue.springtest.ioc.bean.MyImportBeanDefinitionRegistrar;
import com.yue.springtest.ioc.bean.MyImportSelector;
import com.yue.springtest.ioc.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan("com.yue.springtest")
@Configuration
//@Import(value = MyImportSelector.class)
//@Import(value = MyImportBeanDefinitionRegistrar.class)
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }

}
