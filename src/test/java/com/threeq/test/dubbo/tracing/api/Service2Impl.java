package com.threeq.test.dubbo.tracing.api;

/**
 * @Date 2017/2/8
 * @User three
 */
public class Service2Impl implements Service2 {
    public String hi(String name) {
        System.out.println("Service2.hi  "+ name);
        return "Service2.hi："+name;
    }
}
