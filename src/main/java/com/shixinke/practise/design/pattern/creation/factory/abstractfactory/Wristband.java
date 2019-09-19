package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

/**
 *　智能手环
 * @author shixinke
 */
public abstract class Wristband {
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
