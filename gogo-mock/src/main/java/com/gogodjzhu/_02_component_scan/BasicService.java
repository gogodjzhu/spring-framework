package com.gogodjzhu._02_component_scan;

import org.springframework.stereotype.Service;

@Service
public class BasicService {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

}
