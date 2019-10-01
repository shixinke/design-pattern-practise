package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 手机
 * @author shixinke
 */
public abstract class Mobile {
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
