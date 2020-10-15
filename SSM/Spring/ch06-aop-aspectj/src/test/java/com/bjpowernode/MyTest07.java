package com.bjpowernode;

import com.bjpowernode.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeServiceImpl proxy = (SomeServiceImpl) ctx.getBean("someService");


        /**
         * 目标类没有接口，使用cglib动态代理， spring框架会自动应用cglib
         * com.bjpowernode.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$575c8b90
         */
        System.out.println("proxy:"+proxy.getClass().getName());
        //通过代理的对象执行方法，实现目标方法执行时，增强了功能
        proxy.doThird();



    }
}
