package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 华为手环
 * @author shixinke
 */
public class HuaweiWristband extends Wristband {

    public HuaweiWristband(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "华为";
    }
}
