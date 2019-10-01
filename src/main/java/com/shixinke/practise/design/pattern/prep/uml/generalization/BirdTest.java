package com.shixinke.practise.design.pattern.prep.uml.generalization;

/**
 * 鸟类测试
 * @author shixinke
 */
public class BirdTest {

    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.fly();
        Bird dove = new Dove();
        dove.fly();
    }
}
