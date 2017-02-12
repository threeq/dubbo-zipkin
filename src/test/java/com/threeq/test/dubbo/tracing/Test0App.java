package com.threeq.test.dubbo.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Date 2017/2/8
 * @User three
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ImportResource({"file:src/test/java/resources/spring/dubbo-demo-service1-consumer.xml"})
public class Test0App {
    public static void main(String[] args) {
        SpringApplication.run(Test0App.class, args);
    }

}