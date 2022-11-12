package com.design.patterns.creational.builder.italianfood;

import com.design.patterns.creational.builder.italianfood.model.Pasta;
import com.design.patterns.creational.builder.italianfood.model.Size;

/*
 * Lombok has an annotation called "@Builder" that creates this pattern automatically
 * */

public class Client {
    public static void main(String[] args) {
        Pasta fullMeal = new Pasta.Builder("spaghetti", Size.LARGE)
                                  .withCheese()
                                  .withSauces("tomato")
                                  .withToppings("Bacon","Broccoli")
                                  .now();

        System.out.println("Order = " + fullMeal);

    }
}
