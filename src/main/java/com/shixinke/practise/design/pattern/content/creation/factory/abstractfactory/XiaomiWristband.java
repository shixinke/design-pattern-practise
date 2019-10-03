package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 小米手环
 * @return
 */
public class XiaomiWristband extends Wristband {

    public XiaomiWristband(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "小米";
    }
}
