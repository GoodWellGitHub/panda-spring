package com.org.panda.spring.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibCallBackInvocationHandler implements MethodInterceptor {
    private Object target;

    public CglibCallBackInvocationHandler(Object target) {
        this.target = target;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before do ....");

        Object result = method.invoke(target, objects);

        System.out.println("cglib after do ......");

        return result;
    }
}
