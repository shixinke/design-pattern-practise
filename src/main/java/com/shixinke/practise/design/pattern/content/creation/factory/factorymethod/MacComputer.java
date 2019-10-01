package com.shixinke.practise.design.pattern.content.creation.factory.factorymethod;

/**
 * mac电脑
 * @author shixinke
 */
public class MacComputer implements Computer {

    public String getName() {
        return "mac电脑";
    }

    public String getOsName() {
        return "Mac OS";
    }
}
