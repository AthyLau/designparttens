package com.demik.designparttens.structurepatterns.proxy.dynamic_cglib;


/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 3:45 PM
 * @since JDK 1.8
 */
public class Test {
    public static void main(String args[]){
        dynamic_cglib();
    }
    private static void dynamic_cglib(){
        WBQTarget proxy = (WBQTarget) new CglibProxyFactory(new WBQTarget()).getProxy();
        proxy.actMovie();
    }
}
