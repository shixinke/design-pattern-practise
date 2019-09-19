package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class VivoHeadset extends Headset {

    public VivoHeadset(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "Vivo";
    }
}
