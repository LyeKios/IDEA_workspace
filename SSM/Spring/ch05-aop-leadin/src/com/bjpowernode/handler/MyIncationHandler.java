package com.bjpowernode.handler;

import com.bjpowernode.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationHandler implements InvocationHandler {

    //目标对象
    private Object target; //SomeServiceImpl类

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用执行这个invoke（）
        System.out.println("执行MyIncationHandler中的invoke()");
        System.out.println("method名称："+method.getName());
        String methodName = method.getName();
        Object res = null;

        if("doSome".equals(methodName)){ //JoinPoint  Pointcut
            ServiceTools.doLog(); //在目标方法之前，输出时间
            //执行目标类的方法，通过Method类实现
            res  = method.invoke(target,args); //SomeServiceImpl.doSome()
            ServiceTools.doTrans(); //在目标方法执行之后，提交事务
        } else {
            res  = method.invoke(target,args); //SomeServiceImpl.doOther()
        }

        //目标方法的执行结果
        return res;
    }
}
