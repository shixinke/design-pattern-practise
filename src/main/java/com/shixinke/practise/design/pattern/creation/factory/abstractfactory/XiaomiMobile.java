package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class XiaomiMobile extends Mobile {

    public XiaomiMobile(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "小米";
    }
}
