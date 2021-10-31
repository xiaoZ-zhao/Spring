package com.zhao.demo01;
//客户
public class Client {
    public static void main(String[] args) {
        //房东出租房子
         Host host=new Host();
         //代理，中介帮房东出租房子，代理会有一些附属操作！
        Proxy proxy=new Proxy(host);
        //客户直接找中介租房，不要面对房东
        proxy.rent();
    }
}
