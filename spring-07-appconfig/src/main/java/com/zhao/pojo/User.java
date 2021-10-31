package com.zhao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//代表这个类被Spring接管了。注册到容器中
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }
    //注入值
    @Value("李四")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
