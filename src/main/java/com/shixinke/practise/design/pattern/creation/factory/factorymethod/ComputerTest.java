package com.shixinke.practise.design.pattern.creation.factory.factorymethod;

/**
 * 电脑测试类
 * @author shixinke
 */
public class ComputerTest {

    public static void main(String[] args) {
        ComputerFactory factory = new DellComputerFactory();
        Computer computer = factory.produce();
        System.out.println(computer.getName());
    }
}
