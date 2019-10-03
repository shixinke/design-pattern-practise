package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * Vivo耳机
 * @return
 */
public class VivoHeadset extends Headset {

    public VivoHeadset(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "Vivo";
    }
}
