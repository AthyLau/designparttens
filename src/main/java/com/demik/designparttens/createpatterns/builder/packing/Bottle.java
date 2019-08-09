package com.demik.designparttens.createpatterns.builder.packing;

import com.demik.designparttens.createpatterns.builder.packing.Packing;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:33 AM
 * @since JDK 1.8
 */
public class Bottle implements Packing {

    @Override
    public String getPackingName() {
        return "bottle";
    }

    @Override
    public float getPackingPrice() {
        return 1.0f;
    }
}
