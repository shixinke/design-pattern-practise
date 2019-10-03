package com.shixinke.practise.design.pattern.content.creation.factory.factorymethod;

/**
 * 电脑测试类
 * @author shixinke
 */
public class ComputerTest {

    public static void main(String[] args) {
        /**
         * 创建一个Dell工厂，那它生产的就是Dell电脑
         */
        ComputerFactory factory = new DellComputerFactory();
        /**
         * 因为是Dell工厂，因此生产的产品就是Dell电脑
         */
        Computer computer = factory.produce();
        System.out.println(computer.getName());
    }
}
