package com.demik.designparttens.behaviorpatterns.responsibilitychain;

/**
 * Function:    工厂模式加责任链模式
 *
 * @author liubing
 * Date: 2019/9/3 1:55 PM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        AbstractLogger.loggerEntenr.transmitLogger(3, "sssssssss");
    }

}
