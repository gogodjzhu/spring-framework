package com.gogodjzhu._02_component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScan {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_02_component_scan.xml");
        BasicService basicService = applicationContext.getBean(BasicService.class);
        Integer result = basicService.add(1, 1);
        System.out.println("result:" + result);
    }

}
