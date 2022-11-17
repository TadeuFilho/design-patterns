package com.design.patterns.creational.factory.pizzeria.model;

import java.util.Arrays;
import java.util.List;

public class SaltyPizza extends Pizza {

    @Override
    public List<Ingredient> getIngredients() {
        return Arrays.asList(new Ingredient("Queijo"),
                             new Ingredient("Tomate"),
                             new Ingredient("Massa"));
    }
}
