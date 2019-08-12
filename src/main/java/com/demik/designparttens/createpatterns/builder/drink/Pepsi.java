package com.demik.designparttens.createpatterns.builder.drink;

import com.demik.designparttens.createpatterns.builder.drink.ColdDrink;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:47 AM
 * @since JDK 1.8
 */
public class Pepsi extends ColdDrink {

    @Override
    public String getMealName() {
        return "Pepsi";
    }

    @Override
    public float getMealPrice() {
        return 4.0f;
    }

}
