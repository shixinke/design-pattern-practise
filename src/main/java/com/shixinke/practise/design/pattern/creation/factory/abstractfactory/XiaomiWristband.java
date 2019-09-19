package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class XiaomiWristband extends Wristband {

    public XiaomiWristband(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "小米";
    }
}