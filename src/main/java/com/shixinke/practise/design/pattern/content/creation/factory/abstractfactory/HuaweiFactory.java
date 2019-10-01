package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

public class HuaweiFactory implements SmartFactory {
    public Headset produceHeadSet() {
        return new HuaweiHeadset("荣耀xSport 运动蓝牙耳机");
    }

    public Mobile produceMobile() {
        return new HuaweiMobile("Mate 20 X ");
    }

    public Wristband produceWristband() {
        return new HuaweiWristband("3 Pro（曜石黑）智能运动手环");
    }
}
