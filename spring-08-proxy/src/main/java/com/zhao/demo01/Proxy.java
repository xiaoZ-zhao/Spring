package com.zhao.demo01;

import javax.sound.midi.SoundbankResource;

//代理
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent() {
        setHost();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void setHost(){
        System.out.println("中介带你看房");
    }
    //签合同
    public void hetong(){
        System.out.println("中介签合同");
    }
    //看房
    public void fare(){
        System.out.println("中介收中介费");
    }
}
