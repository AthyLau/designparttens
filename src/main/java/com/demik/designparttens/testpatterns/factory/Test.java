package com.demik.designparttens.testpatterns.factory;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 2:06 PM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){

        CarFactory carFactory = new CarFactory();
        carFactory.getCar("ford");

    }


}
