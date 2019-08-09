package com.demik.designparttens.createpatterns.builder.drink;

import com.demik.designparttens.createpatterns.builder.packing.Bottle;
import com.demik.designparttens.createpatterns.builder.meal.MealItem;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:44 AM
 * @since JDK 1.8
 */
public abstract class ColdDrink implements MealItem {

    @Override
    public String getPackingName() {
        return new Bottle().getPackingName();
    }

    @Override
    public float getPackingPrice() {
        return new Bottle().getPackingPrice();
    }

}
