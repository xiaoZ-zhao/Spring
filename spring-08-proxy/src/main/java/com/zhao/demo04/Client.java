package com.zhao.demo04;

import com.zhao.demo02.UserService;
import com.zhao.demo02.UserServiceImpl;

public class Client  {

    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        //设置代理对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService userService1=(UserService) pih.getProxy();
        userService.delete();


    }
}
