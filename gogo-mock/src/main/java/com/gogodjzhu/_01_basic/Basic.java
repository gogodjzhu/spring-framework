package com.gogodjzhu._01_basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Basic {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_01_basic.xml");
        String name = (String) applicationContext.getBean("name");
        System.out.println("start:" + name);
    }

}
