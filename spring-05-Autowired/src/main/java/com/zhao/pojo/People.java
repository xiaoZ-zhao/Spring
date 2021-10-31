package com.zhao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    //如果显式定义了required属性为false,说明这个对象可以为null，否则不允许为空
    @Resource
    private Dao dao;

    @Resource
    private Cat cat;
    private String name;

    public Dao getDao() {
        return dao;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dao=" + dao +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
