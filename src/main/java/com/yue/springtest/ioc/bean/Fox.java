package com.yue.springtest.ioc.bean;

import lombok.Data;

@Data
public class Fox {

    private String name;

    private int age;

    public Fox() {
        System.out.println("调用了Fox（）构造器!");
    }
}
