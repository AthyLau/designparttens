package com.demik.designparttens.createpatterns.builder.meal;

import com.demik.designparttens.createpatterns.builder.burger.ChickenBurger;
import com.demik.designparttens.createpatterns.builder.drink.Pepsi;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:57 AM
 * @since JDK 1.8
 */
public class MealBuilder {

    public Meal getDinner(){
        Meal meal = new Meal();
        meal.addMealItem(new ChickenBurger());
        meal.addMealItem(new ChickenBurger());
        meal.addMealItem(new ChickenBurger());
        meal.addMealItem(new Pepsi());
        meal.addMealItem(new Pepsi());
        meal.addMealItem(new Pepsi());
        return meal;
    }

    public Meal getLunch(){
        Meal meal = new Meal();
        meal.addMealItem(new ChickenBurger());
        meal.addMealItem(new ChickenBurger());
        meal.addMealItem(new Pepsi());
        meal.addMealItem(new Pepsi());
        return meal;
    }

    public Meal getBreakfast(){
        Meal meal = new Meal();
        meal.addMealItem(new ChickenBurger());
        meal.addMealItem(new Pepsi());
        return meal;
    }

}
