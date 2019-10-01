package com.shixinke.practise.design.pattern.content.creation.factory.simplefactory;

/**
 * 电脑测试类
 * @author shixinke
 */
public class ComputerTest {

    public static void main(String[] args) {
        Computer c1 = ComputerFactory.getComputer("thinkpad");
        System.out.println("name = " + c1.getName() + "; os = " + c1.getOsName());
        Computer c2 = ComputerFactory.getComputer("mac");
        System.out.println("name = " + c2.getName() + "; os = " + c2.getOsName());
        Computer c3 = ComputerFactory.getComputer("dell");
        System.out.println("name = " + c3.getName() + "; os = " + c3.getOsName());
    }
}
