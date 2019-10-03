package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 小米耳机
 * @return
 */
public class XiaomiHeadset extends Headset {

    public XiaomiHeadset(String name) {
        this.name = name;
    }

    @Override
    public String getBrand() {
        return "小米";
    }
}
