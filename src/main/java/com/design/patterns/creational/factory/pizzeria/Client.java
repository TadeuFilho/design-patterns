package com.design.patterns.creational.factory.pizzeria;

import com.design.patterns.creational.factory.apple.model.Flavor;
import com.design.patterns.creational.factory.pizzeria.factory.PizzaFactory;
import com.design.patterns.creational.factory.pizzeria.model.Pizza;

public class Client {

    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.getInstance(Flavor.SALTY);
        System.out.println(pizza);

    }
}
