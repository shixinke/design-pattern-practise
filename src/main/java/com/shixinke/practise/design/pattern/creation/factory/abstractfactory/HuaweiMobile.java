package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class HuaweiMobile extends Mobile {

    public HuaweiMobile(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "华为";
    }
}
