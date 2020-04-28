package com.yue.springtest.ioc.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangyue
 */
@Component
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new ReentrantLock();
    }

    @Override
    public Class<?> getObjectType() {
        return ReentrantLock.class;
    }
}
