package com.shixinke.practise.design.pattern.prep.principle.liskovsubstitution;

/**
 * 测试类
 * @author shixinke
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        /**
         * 猴子
         */
        Animal mon = new Monkey();
        mon.eat();
    }
}
