package com.gogodjzhu._03_simple_aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleAopService {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

}
