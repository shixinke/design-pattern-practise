package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class HuaweiWristband extends Wristband {

    public HuaweiWristband(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "华为";
    }
}
