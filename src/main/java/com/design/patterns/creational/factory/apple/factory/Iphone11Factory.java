package com.design.patterns.creational.factory.apple.factory;

import com.design.patterns.creational.factory.apple.model.*;

public class Iphone11Factory extends IphoneFactory {

    @Override
    protected Iphone createIphone(String level) {
        if(level.equals("standard")) {
            return new Iphone11();
        } else if(level.equals("highEnd")) {
            return new Iphone11Pro();
        } else return null;
    }
}