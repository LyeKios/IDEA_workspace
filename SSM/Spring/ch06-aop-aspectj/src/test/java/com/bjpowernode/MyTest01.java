package com.bjpowernode;

import com.bjpowernode.ba01.SomeService;
import com.bjpowernode.ba01.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        SomeService other = (SomeService) ctx.getBean("otherService");

        //com.sun.proxy.$Proxy8 :jdk动态代理
        //com.sun.proxy.$Proxy0
        System.out.println("proxy:"+proxy.getClass().getName());
        //通过代理的对象执行方法，实现目标方法执行时，增强了功能
        proxy.doSome("lisi",20);
        other.doSome("zhangsan", 21);
//        proxy.doOther("zhangsan", 21);
    }
}
