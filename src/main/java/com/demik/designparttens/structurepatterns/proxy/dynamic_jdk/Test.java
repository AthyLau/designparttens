package com.demik.designparttens.structurepatterns.proxy.dynamic_jdk;


/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 3:44 PM
 * @since JDK 1.8
 */
public class Test {
    public static void main(String args[]){
        dynamic_jdk();
    }
    private static void dynamic_jdk(){
        Actor proxy = (Actor) new JdkProxyFactory(new WBQTarget()).getProxyObj();
        proxy.actMovie();
    }
}
