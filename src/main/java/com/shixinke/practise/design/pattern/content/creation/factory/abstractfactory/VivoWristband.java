package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

public class VivoWristband extends Wristband {

    public VivoWristband(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "Vivo";
    }
}
