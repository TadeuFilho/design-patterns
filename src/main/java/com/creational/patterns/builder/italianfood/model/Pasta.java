package com.creational.patterns.builder.italianfood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Data
public class Pasta {

    final private String type;
    final private List<String> toppings;
    final private List<String> sauces;
    final private Size size;
    final private boolean cheese;
    final private boolean pepper;

    @RequiredArgsConstructor
    public static class Builder {

        @NonNull
        protected String type;
        @NonNull
        protected Size size;

        protected List<String> toppings;
        protected List<String> sauces;
        protected boolean cheese;
        protected boolean pepper;

        public Builder withPepper() {
            this.pepper = true;
            return this;
        }

        public Builder withCheese() {
            this.cheese = true;
            return this;
        }
        public Builder withSauces(String... sauces) {
            this.sauces = Arrays.asList(sauces);
            return this;
        }
        public Builder withToppings(String... toppings) {
            this.toppings = Arrays.asList(toppings);
            return this;
        }

        public Pasta now() {
            return new Pasta(type,toppings,sauces,size,cheese,pepper);
        }
    }

}
