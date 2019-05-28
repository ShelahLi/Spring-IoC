package com.lucky.ioc.demo2;

/**
 * Bean3的实例工厂：区别在于不提供静态方法，就需要先在xml文件中实例化工厂
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3Factory执行了...");
        return new Bean3();
    }
}
