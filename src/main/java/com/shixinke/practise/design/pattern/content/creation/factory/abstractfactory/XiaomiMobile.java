package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 小米手机
 * @return
 */
public class XiaomiMobile extends Mobile {

    public XiaomiMobile(String name) {
        this.name = name;
    }

    @Override
    String getBrand() {
        return "小米";
    }
}
