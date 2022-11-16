package com.design.patterns.creational.factory.apple.factory;

import com.design.patterns.creational.factory.apple.model.Iphone;
import com.design.patterns.creational.factory.apple.model.IphoneX;
import com.design.patterns.creational.factory.apple.model.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory {

    @Override
    protected Iphone createIphone(String level) {
        if(level.equals("standard")) {
            return new IphoneX();
        } else if(level.equals("highEnd")) {
            return new IphoneXSMax();
        } else return null;
    }
}