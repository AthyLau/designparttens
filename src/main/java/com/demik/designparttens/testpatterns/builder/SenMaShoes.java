package com.demik.designparttens.testpatterns.builder;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 5:15 PM
 * @since JDK 1.8
 */
public class SenMaShoes implements Shoes {
    @Override
    public Double getPrice() {
        return 198.0;
    }

    @Override
    public Integer getSize() {
        return 43;
    }
}
