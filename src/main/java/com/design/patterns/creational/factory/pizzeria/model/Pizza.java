package com.design.patterns.creational.factory.pizzeria.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public abstract class Pizza {

    protected List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    };


}
