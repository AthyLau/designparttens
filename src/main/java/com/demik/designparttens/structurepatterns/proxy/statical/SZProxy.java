package com.demik.designparttens.structurepatterns.proxy.statical;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 2:59 PM
 * @since JDK 1.8
 */
public class SZProxy implements Actor {

    private Actor taget;

    public SZProxy(WBQTarget wbqTarget){
        this.taget = wbqTarget;
    }

    @Override
    public void actMovie() {
        before();
        taget.actMovie();
        after();
    }

    private void before(){
        System.out.println("演电影前");
    }

    private void after(){
        System.out.println("演电影后");
    }

}
