package com.lucky.ioc.demo1;

/**
 * reated by lth on 2019/05/27.
 */
public class UserServiceImpl implements  UserService{

    // 添加属性:
    private String name;

    public void sayHello() {
        System.out.println("Hello Spring" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
