package com.design.patterns.creational.factory.pizzeria.factory;

import com.design.patterns.creational.factory.apple.model.Flavor;
import com.design.patterns.creational.factory.pizzeria.model.Pizza;
import com.design.patterns.util.FunctionsUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PizzaFactory {

    public static Pizza getInstance(Flavor flavor){
        return FunctionsUtil.getPizzaFlavor.apply(flavor);
    }

}
