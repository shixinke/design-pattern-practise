package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class HuaweiHeadset extends Headset {

    public HuaweiHeadset(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "华为";
    }
}
