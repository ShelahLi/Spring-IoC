package com.lucky.ioc.demo1;

import org.junit.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by jt
 */
public class SpringDemo1 {


    /**
     * 传统方式开发
     */
    @Test
    public void demo1() {
        // UserService userService = new UserServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        // 设置属性:
        userService.setName("张三");
        userService.sayHello();
    }

    /**
     * spring方式开发
     */
    @Test
    public void demo2() {

        //创建spring的工厂
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }

    /**
     * 读取磁盘系统中的配置文件
     */
    @Test
    public void demo3(){
        // 创建Spring的工厂类:
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("c:\\applicationContext.xml");
        // 通过工厂获得类:
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }

    @Test
    /**
     * 传统方式的工厂类:BeanFactory
     */
    public void demo4(){
        // 创建工厂类:
        BeanFactory beanFactory =
                new XmlBeanFactory(new ClassPathResource("config/spring/applicationContext.xml"));
        // 通过工厂获得类:
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();
    }

    /**
     * 传统方式的工厂类:BeanFactory
     */
    @Test
    public void demo5(){
        // 创建工厂类:
        BeanFactory beanFactory =
                new XmlBeanFactory(new FileSystemResource("c:\\applicationContext.xml"));
        // 通过工厂获得类:
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();
    }


}
