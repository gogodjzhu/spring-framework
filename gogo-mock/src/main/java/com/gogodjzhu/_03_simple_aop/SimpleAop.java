package com.gogodjzhu._03_simple_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleAop {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_03_simple_aop.xml");
        SimpleAopService basicService = applicationContext.getBean(SimpleAopService.class);
        Integer result = basicService.add(1, 1);
        System.out.println("result:" + result);
    }

}
