package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 华为耳机
 * @author shixinke
 */
public class HuaweiHeadset extends Headset {

    public HuaweiHeadset(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "华为";
    }
}
