package com.demik.designparttens.createpatterns.builder;

import com.demik.designparttens.createpatterns.builder.meal.MealBuilder;

/**
 * Function:建造者模式，把对象一个个组合起来形成一个新的对象
 *
 * @author liubing
 * Date: 2019/8/6 11:56 AM
 * @since JDK 1.8
 */
public class Test {
    public static void main(String args[]){

        MealBuilder mealBuilder = new MealBuilder();
        System.out.println("Breakfast:");
        mealBuilder.getBreakfast().getItemsName();
        System.out.println("总价："+mealBuilder.getBreakfast().getPrice());
        System.out.println();
        System.out.println();
        System.out.println("Dinner:");
        mealBuilder.getDinner().getItemsName();
        System.out.println("总价："+mealBuilder.getDinner().getPrice());
        System.out.println();
        System.out.println();
        System.out.println("Lunch:");
        mealBuilder.getLunch().getItemsName();
        System.out.println("总价："+mealBuilder.getLunch().getPrice());


    }
}
