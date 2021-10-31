package com.zhao.config;

import com.zhao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//也会被Spring容器托管，注册到容器中
@Configuration //代表是一个配置类，例如之前的beans.xml
@ComponentScan("com.zhao.pojo")
@Import(ZhaoConfig2.class)
public class ZhaoConfig {

    //注册bean相当于之前写的bean
    //这个方法的名字相当于bean中的id
    //方法的返回值代表bean中的class属性
    @Bean
    public User getUser(){
        return new User();//返回注入bean的对象
    }
}
