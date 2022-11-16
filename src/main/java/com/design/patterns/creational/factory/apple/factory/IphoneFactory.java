package com.design.patterns.creational.factory.apple.factory;

import com.design.patterns.creational.factory.apple.model.Iphone;

public abstract class IphoneFactory {

    public Iphone orderIphone(String level) {
        Iphone device = null;
        device = createIphone(level);
        device.assemble();
        device.certificates();
        device.getHardware();

        return device;
    }

    protected abstract Iphone createIphone(String level);
}
