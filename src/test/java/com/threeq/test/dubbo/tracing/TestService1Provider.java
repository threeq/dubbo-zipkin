package com.threeq.test.dubbo.tracing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Date 2017/2/8
 * @User three
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(name = "TestService1Provider", classes = Test1App.class,
        loader = SpringApplicationContextLoader.class)
//@SpringApplicationConfiguration()

//@RunWith(SpringRunner.class)
//@SpringBootTest(properties = {"spring.application.name=TestService1Provider"})
//@ContextConfiguration(locations = {"classpath:spring/dubbo-demo-service1-provider.xml"}, classes = TestApp.class)
public class TestService1Provider {

    @Test
    public void test1() {
        try {
            System.out.println("Start  TestService1Provider");
            int wait = 3000000/3000;
            for(int i=0; i<wait; i++) {
                Thread.sleep(3000);
                System.out.println("wait ...");
            }
            System.out.println("End  TestService1Provider");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}