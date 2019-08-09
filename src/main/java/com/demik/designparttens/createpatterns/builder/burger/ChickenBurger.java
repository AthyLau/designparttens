package com.demik.designparttens.createpatterns.builder.burger;

import com.demik.designparttens.createpatterns.builder.burger.Burger;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:42 AM
 * @since JDK 1.8
 */
public class ChickenBurger extends Burger {
    @Override
    public String getMealName() {
        return "ChickenBurger";
    }

    @Override
    public float getMealPrice() {
        return 20.0f;
    }
}
