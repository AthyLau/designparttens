package com.demik.designparttens.createpatterns.builder.drink;

import com.demik.designparttens.createpatterns.builder.drink.ColdDrink;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:48 AM
 * @since JDK 1.8
 */
public class Coke extends ColdDrink {
    @Override
    public String getMealName() {
        return "Coke";
    }

    @Override
    public float getMealPrice() {
        return 5.0f;
    }
}
