package com.demik.designparttens.structurepatterns.decorator;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 1:47 PM
 * @since JDK 1.8
 */
public class Sunset implements Picture {
    @Override
    public void show() {
        System.out.println("Picture : Sunset ");
    }
}
