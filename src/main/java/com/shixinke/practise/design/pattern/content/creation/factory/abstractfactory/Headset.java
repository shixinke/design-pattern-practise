package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 耳机
 * @author shixinke
 */
public abstract class Headset {
    protected String name;


    public String getName() {
        return this.getBrand() + name;
    }

    /**
     * 获取品牌
     * @return
     */
    abstract String getBrand();
}
