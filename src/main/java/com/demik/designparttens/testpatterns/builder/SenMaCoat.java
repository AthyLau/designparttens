package com.demik.designparttens.testpatterns.builder;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 5:14 PM
 * @since JDK 1.8
 */
public class SenMaCoat implements Clothes {


    @Override
    public Double getPrice() {
        return 200.0;
    }

    @Override
    public String getSize() {
        return "XXL";
    }


}
