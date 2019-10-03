package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

/**
 * 华为工厂
 * @author shixinke
 */
public class HuaweiFactory implements SmartFactory {
    /**
     * 华为工厂生产华为耳机
     * @return
     */
    public Headset produceHeadSet() {
        return new HuaweiHeadset("荣耀xSport 运动蓝牙耳机");
    }

    /**
     * 华为工厂生产华为手机
     * @return
     */
    public Mobile produceMobile() {
        return new HuaweiMobile("Mate 20 X ");
    }

    /**
     * 华为工厂生产华为手环
     * @return
     */
    public Wristband produceWristband() {
        return new HuaweiWristband("3 Pro（曜石黑）智能运动手环");
    }
}
