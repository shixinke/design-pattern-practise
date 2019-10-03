package com.shixinke.practise.design.pattern.content.creation.factory.factorymethod;

/**
 * ThinkPad电脑工厂
 * @author shixinke
 */
public class ThinkPadComputerFactory implements ComputerFactory {
    public Computer produce() {
        return new ThinkPadComputer();
    }
}
