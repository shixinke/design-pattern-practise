package com.shixinke.practise.design.pattern.prep.uml.generalization;

/**
 * 鸟类
 * @author shixinke
 */
public abstract class Bird {
    /**
     * 鸟都会鸣叫
     */
    public void say() {
        System.out.println("说话");
    }

    /**
     * 飞翔
     */
    public abstract void fly();
}
