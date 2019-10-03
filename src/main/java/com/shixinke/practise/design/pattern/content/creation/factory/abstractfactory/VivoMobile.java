package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * Vivo手机
 * @return
 */
public class VivoMobile extends Mobile {

    public VivoMobile(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "vivo";
    }
}
