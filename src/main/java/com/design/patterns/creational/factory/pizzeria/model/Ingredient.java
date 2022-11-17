package com.design.patterns.creational.factory.pizzeria.model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Ingredient {

    private String name;
}
