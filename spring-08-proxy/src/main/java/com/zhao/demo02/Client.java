package com.zhao.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        //userService.add();
        UserProxy userProxy=new UserProxy();
        userProxy.setUserService(userService);
        userProxy.query();
    }
}
