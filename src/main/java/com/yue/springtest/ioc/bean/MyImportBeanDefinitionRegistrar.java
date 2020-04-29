package com.yue.springtest.ioc.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangyue
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //创建BeanDefinition
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Fox.class);
        //注册
        registry.registerBeanDefinition("fox",rootBeanDefinition);
    }
}
