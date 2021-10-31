package com.zhao.demo02;

public class UserProxy implements UserService{
    private UserService userService;

    public UserProxy() {
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void log(String message){
        System.out.println("使用了"+message+"方法");
    }
}
