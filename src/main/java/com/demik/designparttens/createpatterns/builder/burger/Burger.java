package com.demik.designparttens.createpatterns.builder.burger;

import com.demik.designparttens.createpatterns.builder.meal.MealItem;
import com.demik.designparttens.createpatterns.builder.packing.Wrapper;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:30 AM
 * @since JDK 1.8
 */
public abstract class Burger implements MealItem {

    @Override
    public String getPackingName() {
        return new Wrapper().getPackingName();
    }

    @Override
    public float getPackingPrice() {
        return new Wrapper().getPackingPrice();
    }

}
