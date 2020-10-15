package org.example;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class doSomeTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void testSpring(){
        String config = "beans.xml";
        ApplicationContext ss = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) ss.getBean("someService");
        someService.doSome();

        int count = ss.getBeanDefinitionCount();
        String[] names = ss.getBeanDefinitionNames();

        System.out.println(count);
        for (String name : names){
            System.out.println(name);
        }


    }
}
