package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 小米工厂
 * @author shixinke
 */
public class XiaomiFactory implements SmartFactory {
    /**
     * 小米工厂生产小米耳机
     * @return
     */
    public Headset produceHeadSet() {
        return new XiaomiHeadset("降噪项圈蓝牙耳机");
    }

    /**
     * 小米工厂生产小米手机
     * @return
     */
    public Mobile produceMobile() {
        return new XiaomiMobile("MIX 3");
    }

    /**
     * 小米工厂生产小米手环
     * @return
     */
    public Wristband produceWristband() {
        return new XiaomiWristband("Amazfit手环");
    }
}
