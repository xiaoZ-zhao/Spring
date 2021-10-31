package com.zhao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等同于<bean id="user” class="com.zhao.pojo.User" />
//@Component组件

@Component
@Scope("singleton")
public class User {
    //相当于 <property name="name" value="李四" />

    public String name;

    @Value("李四")
    public void setName(String name) {
        this.name = name;
    }
}
