package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * Vivo手环
 * @return
 */
public class VivoWristband extends Wristband {

    public VivoWristband(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "Vivo";
    }
}
