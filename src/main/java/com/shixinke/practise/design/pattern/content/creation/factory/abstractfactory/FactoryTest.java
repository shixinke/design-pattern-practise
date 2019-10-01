package com.shixinke.practise.design.pattern.content.creation.factory.abstractfactory;

public class FactoryTest {

    public static void main(String[] args) {
        SmartFactory factory = new VivoFactory();
        Headset headset = factory.produceHeadSet();
        Mobile mobile = factory.produceMobile();
        Wristband wristband = factory.produceWristband();
        System.out.println("耳机:"+headset.getName() +" 手机:"+mobile.getName() +" 手环："+wristband.getName());
    }
}
