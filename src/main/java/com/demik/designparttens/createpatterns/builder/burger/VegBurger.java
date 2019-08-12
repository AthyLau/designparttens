package com.demik.designparttens.createpatterns.builder.burger;

import com.demik.designparttens.createpatterns.builder.burger.Burger;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:43 AM
 * @since JDK 1.8
 */
public class VegBurger extends Burger {

    @Override
    public String getMealName() {
        return "VegBurger";
    }

    @Override
    public float getMealPrice() {
        return 30.0f;
    }
}
