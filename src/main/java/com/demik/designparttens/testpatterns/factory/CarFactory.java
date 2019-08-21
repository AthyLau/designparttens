package com.demik.designparttens.testpatterns.factory;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 2:03 PM
 * @since JDK 1.8
 */
public class CarFactory {

    public Car getCar(String carType){

        switch (carType){
            case "ford":
                return new Ford();
            case "bmw":
                return new BMW();
            default:
                return null;
        }

    }


}
