package com.design.patterns.creational.factory.apple;

import com.design.patterns.creational.factory.apple.factory.Iphone11Factory;
import com.design.patterns.creational.factory.apple.factory.IphoneFactory;
import com.design.patterns.creational.factory.apple.factory.IphoneXFactory;
import com.design.patterns.creational.factory.apple.model.Iphone;

public class Client {
    public static void main(String[] args) {
        IphoneFactory genXFactory = new IphoneXFactory();
        IphoneFactory gen11Factory = new Iphone11Factory();

        System.out.println("### Ordering an iPhone X");
        Iphone iphone = genXFactory.orderIphone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone2 = gen11Factory.orderIphone("highEnd");
        System.out.println(iphone2);

    }
}
