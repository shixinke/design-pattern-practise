package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;
/**
 * Vivo工厂
 * @author shixinke
 */
public class VivoFactory implements SmartFactory {
    /**
     * Vivo工厂生产vivo耳机
     * @return
     */
    public Headset produceHeadSet() {
        return new VivoHeadset("TWS Earphone 真无线蓝牙耳机");
    }

    /**
     * Vivo工厂生产vivo手机
     * @return
     */
    public Mobile produceMobile() {
        return new VivoMobile("NEX 3");
    }

    /**
     * Vivo工厂生产vivo手环
     * @return
     */
    public Wristband produceWristband() {
        return new VivoWristband("乐心手环Mambo5");
    }
}
