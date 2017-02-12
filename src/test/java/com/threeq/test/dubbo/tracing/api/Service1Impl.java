package com.threeq.test.dubbo.tracing.api;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Date 2017/2/8
 * @User three
 */
public class Service1Impl implements Service1 {
    @Autowired
    Service2 service2;

    public String hi(String name) {
        System.out.println("Service1.hi  "+ name);
        return "Service1.hi：" +name+"  "+ service2.hi(name);
    }
}
