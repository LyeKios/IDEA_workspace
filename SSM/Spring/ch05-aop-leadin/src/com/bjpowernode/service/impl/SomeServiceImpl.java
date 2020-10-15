package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.util.ServiceTools;

import java.util.Date;

// service类的代码不修改，也能够增加 输出时间， 事务。
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
        int res  = 10 + 20;
        //更新购买商品的库存， 生成订单， 结算整个购买商品的总价。
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}
