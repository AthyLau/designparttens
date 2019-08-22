package com.demik.designparttens.testpatterns.builder;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 5:17 PM
 * @since JDK 1.8
 */
public class JDShoes implements Shoes {
    @Override
    public Double getPrice() {
        return 3400.0;
    }

    @Override
    public Integer getSize() {
        return 43;
    }
}
