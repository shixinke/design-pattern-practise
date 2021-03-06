package com.shixinke.practise.design.pattern.content.creation.factory.factorymethod;

/**
 * mac电脑工厂
 * @author shixinke
 */
public class MacComputerFactory implements ComputerFactory {
    public Computer produce() {
        return new MacComputer();
    }
}
