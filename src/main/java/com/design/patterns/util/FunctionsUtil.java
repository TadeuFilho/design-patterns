package com.design.patterns.util;

import com.design.patterns.creational.factory.apple.model.Flavor;
import com.design.patterns.creational.factory.pizzeria.model.Pizza;
import com.design.patterns.creational.factory.pizzeria.model.SaltyPizza;
import com.design.patterns.creational.factory.pizzeria.model.SweetPizza;

import java.util.function.Function;

public class FunctionsUtil {
    public static Function<Flavor,Pizza> getPizzaFlavor =
            flavor -> flavor.equals(Flavor.SWEET) ? new SweetPizza() : new SaltyPizza();

}
