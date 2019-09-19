package com.shixinke.practise.design.pattern.creation.factory.factorymethod;

/**
 * 电脑工厂
 * @author shixinke
 */
public interface ComputerFactory {
    /**
     * 生产电脑
     * @return
     */
    Computer produce();
}
