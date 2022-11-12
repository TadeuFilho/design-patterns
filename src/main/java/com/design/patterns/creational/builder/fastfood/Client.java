package com.design.patterns.creational.builder.fastfood;

import com.design.patterns.creational.builder.fastfood.builder.FastFoodMealBuilder;
import com.design.patterns.creational.builder.fastfood.model.FastFoodMeal;

/*
* Lombok has an annotation called "@Builder" that creates this pattern automatically
* */

public class Client {
    public static void main(String[] args) {

        FastFoodMeal onlyMain = new FastFoodMealBuilder("CheeseBurger").thatsAll();

        FastFoodMeal fullMeal = new FastFoodMealBuilder("Double CheeseBurger")
                                                .forDrink("Coke")
                                                .forSide("Fries")
                                                .andDessert("Chocolate Cake")
                                                .thatsAll();
        System.out.println("First order = " + onlyMain);
        System.out.println("Second one = " + fullMeal);

    }
}
