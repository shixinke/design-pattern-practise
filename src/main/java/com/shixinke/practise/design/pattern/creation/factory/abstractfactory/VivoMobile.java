package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class VivoMobile extends Mobile {

    public VivoMobile(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "vivo";
    }
}
