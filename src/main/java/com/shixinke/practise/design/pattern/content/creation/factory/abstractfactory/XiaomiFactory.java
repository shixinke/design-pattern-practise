package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

public class XiaomiFactory implements SmartFactory {
    public Headset produceHeadSet() {
        return new XiaomiHeadset("降噪项圈蓝牙耳机");
    }

    public Mobile produceMobile() {
        return new XiaomiMobile("MIX 3");
    }

    public Wristband produceWristband() {
        return new XiaomiWristband("Amazfit手环");
    }
}
