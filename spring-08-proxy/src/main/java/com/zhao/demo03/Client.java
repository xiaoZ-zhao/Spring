package com.zhao.demo03;

import javax.xml.ws.Holder;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host=new Host();

        //代理角色
        ProxyInvocationHandler proxyInvocationHandler=new ProxyInvocationHandler();
        //通过调用程序处理角色，来处理要调用的接口对象
        proxyInvocationHandler.setRent(host);

        Rent proxy=(Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
