package com.demik.designparttens.structurepatterns.proxy.dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 3:19 PM
 * @since JDK 1.8
 */
public class JdkProxyFactory {
    //维护一个目标对象
    private Object target;

    public JdkProxyFactory(Object target){
        this.target = target;
    }
    //生成代理对象
    public Object getProxyObj(){
        if(target == null){
            return null;
        }
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            before();
            //使用反射的方法来调用方法
            Object value = method.invoke(target, args);
            after();
            return value;
        });
    }

    private void before(){
        System.out.println("prefix handler");
    }

    private void after(){
        System.out.println("after handler");
    }

}
