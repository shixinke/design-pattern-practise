package com.shixinke.practise.design.pattern.creation.factory.abstractfactory;

public class VivoFactory implements SmartFactory {
    public Headset produceHeadSet() {
        return new VivoHeadset("TWS Earphone 真无线蓝牙耳机");
    }

    public Mobile produceMobile() {
        return new VivoMobile("NEX 3");
    }

    public Wristband produceWristband() {
        return new VivoWristband("乐心手环Mambo5");
    }
}
