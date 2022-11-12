package com.design.patterns.creational.builder.fastfood.builder;

import com.design.patterns.creational.builder.fastfood.model.FastFoodMeal;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FastFoodMealBuilder {

    @NonNull
    private String main;

    private String side;
    private String drink;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder forDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public  FastFoodMealBuilder forSide(String side) {
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(main,side,drink,dessert,gift);
    }


}

