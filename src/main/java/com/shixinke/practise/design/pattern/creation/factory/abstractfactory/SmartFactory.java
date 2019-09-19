package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

/**
 * 智能工厂
 */
public interface SmartFactory {
    /**
     * 生产耳机
     * @return
     */
    Headset produceHeadSet();

    /**
     * 生产手机
     * @return
     */
    Mobile produceMobile();

    /**
     * 生产手环
     * @return
     */
    Wristband produceWristband();
}
