package com.threeq.test.dubbo.tracing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Date 2017/2/8
 * @User three
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@SpringApplicationConfiguration(name = "TestService2Provider", classes = Test2App.class)
//@RunWith(SpringRunner.class)
//@SpringBootTest(properties = {"spring.application.name=TestService2Provider"})
//@ContextConfiguration(locations = {"classpath:spring/dubbo-demo-service2-provider.xml"}, classes = TestApp.class)
public class TestService2Provider {


    @Test
    public void test2() {
        try {
            System.out.println("Start  TestService2Provider");
            int wait = 3000000/3000;
            for(int i=0; i<wait; i++) {
                Thread.sleep(3000);
                System.out.println("wait ...");
            }
            System.out.println("End  TestService2Provider");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}