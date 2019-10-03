package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 华为手机
 * @author shixinke
 */
public class HuaweiMobile extends Mobile {

    public HuaweiMobile(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "华为";
    }
}
