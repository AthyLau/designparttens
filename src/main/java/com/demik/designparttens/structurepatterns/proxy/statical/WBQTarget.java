package com.demik.designparttens.structurepatterns.proxy.statical;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 2:55 PM
 * @since JDK 1.8
 */
public class WBQTarget implements Actor {

    public WBQTarget(){
        System.out.println("I am WBQ");
    }

    @Override
    public void actMovie() {
        System.out.println("wangbaoqiang act a movie with marong");;
    }
}
