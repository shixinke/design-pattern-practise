package com.shixinke.practise.design.pattern.prep.uml.implementation;

/**
 * 可计算接口测试类
 * @author shixinke
 */
public class ComputableTest {
    public static void main(String[] args) {
        Computable calculator = new Calculator();
        Computable computer = new Computer();
        calculator.compute();
        computer.compute();
    }
}
