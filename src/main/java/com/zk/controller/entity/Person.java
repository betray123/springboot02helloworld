package com.zk.controller.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zk on 18/5/21.
 */
//将配置文件中配置的每一个属性的值,映射到这个组建中
//@ConfigurationProperties :告诉springboot将本类中的所有属性和配置文件中相关的配置进行绑定;
    //prefix = "person" :配置文件中哪个下面的属性进行一对一映射

//只有这个组件是springboot容器中的组件时,才能使用容器提供的@ConfigurationProperties功能;
@Component //将这个组件加入容器
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private int age;
    private boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
