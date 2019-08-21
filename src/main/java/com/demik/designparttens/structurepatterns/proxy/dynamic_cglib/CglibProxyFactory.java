package com.demik.designparttens.structurepatterns.proxy.dynamic_cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Function:   在内存中动态的构建一个目标类的子类对象，对目标类进行扩展
 *
 * @author liubing
 * Date: 2019/8/21 3:34 PM
 * @since JDK 1.8
 */
public class CglibProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;
    public CglibProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxy(){
        Enhancer en = new Enhancer();
        en.setCallback(this);
        en.setSuperclass(target.getClass());
        return en.create();
    }

    private void before(){
        System.out.println("before handler");
    }

    private void after(){
        System.out.println("after handler");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        getProxy();
        before();
        Object returnValue = method.invoke(target, args);
        after();
        return returnValue;
    }

}
