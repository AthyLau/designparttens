package com.demik.designparttens.structurepatterns.proxy.statical;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 3:44 PM
 * @since JDK 1.8
 */
public class Test {
    public static void main(String args[]){
        staticalTest();
    }
    private static void staticalTest(){
        SZProxy szProxy = new SZProxy(new WBQTarget());
        szProxy.actMovie();
    }
}
