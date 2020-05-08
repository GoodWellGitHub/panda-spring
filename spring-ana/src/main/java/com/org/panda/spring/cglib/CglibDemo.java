package com.org.panda.spring.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibDemo {
    public static void main(String[] args) {
        TargetAction targetAction = new TargetAction("demo1");
        CglibCallBackInvocationHandler handler = new CglibCallBackInvocationHandler(targetAction);

        Enhancer enhancer = new Enhancer();
        //设置代理什么类
        enhancer.setSuperclass(targetAction.getClass());
        //设置invoker
        enhancer.setCallback(handler);

        TargetAction result = (TargetAction) enhancer.create();

        String proxyResult = result.doSomething();

        System.out.println(proxyResult);
    }
}
