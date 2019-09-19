package com.shixinke.practise.design.pattern.creation.factory.factorymethod;

/**
 * Dell电脑工厂
 * @author shixinke
 */
public class DellComputerFactory implements ComputerFactory {
    public Computer produce() {
        return new DellComputer();
    }
}
