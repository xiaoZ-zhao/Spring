package com.zhao.pojo;

public class UserT {
    private String name;

//    public User() {
//        System.out.println("User的无参构造");
//    }


    public UserT() {
        System.out.println("UserT无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }
}
