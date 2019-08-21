package com.demik.designparttens.structurepatterns.proxy.dynamic_cglib;


/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 2:55 PM
 * @since JDK 1.8
 */
public class WBQTarget{

    public WBQTarget(){
        System.out.println("I am WBQ");
    }

    public void actMovie() {
        System.out.println("wangbaoqiang act a movie with marong");;
    }
}
