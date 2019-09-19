package com.shixinke.practise.design.pattern.creation.factory.factorymethod;

/**
 * ThinkPad电脑工厂
 */
public class ThinkPadComputerFactory implements ComputerFactory {
    public Computer produce() {
        return new ThinkPadComputer();
    }
}
