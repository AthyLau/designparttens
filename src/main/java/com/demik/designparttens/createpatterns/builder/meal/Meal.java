package com.demik.designparttens.createpatterns.builder.meal;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/6 11:44 AM
 * @since JDK 1.8
 */
public class Meal {

    private List<MealItem> mealItems = new ArrayList<>();

    public void addMealItem(MealItem mealItem){
        mealItems.add(mealItem);
    }

    public float getPrice(){
        float sum = 0;
        for (MealItem mealItem : mealItems) {
            sum = sum + mealItem.getMealPrice()+mealItem.getPackingPrice();
        }
        return sum;
    }

    public void getItemsName(){
        mealItems.forEach(x->{
            System.out.println(x.getMealName()+"  "+x.getMealPrice()+"   "+x.getPackingName()+"   "+x.getPackingPrice());
        });
    }
}
