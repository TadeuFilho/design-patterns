package com.design.patterns.creational.factory.pizzeria.model;

import java.util.Arrays;
import java.util.List;

public class SweetPizza extends Pizza {

    @Override
    public List<Ingredient> getIngredients() {
        return Arrays.asList(new Ingredient("Chocolate"),
                             new Ingredient("Creme de leite"),
                             new Ingredient("Raspas de chocolate meio amargo"));
    }
}
