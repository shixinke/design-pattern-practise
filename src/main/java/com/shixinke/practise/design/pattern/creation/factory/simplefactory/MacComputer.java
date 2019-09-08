package com.shixinke.practise.design.pattern.creation.factory.simplefactory;

/**
 * mac电脑
 * @author shixinke
 */
public class MacComputer implements Computer {
    public String getName() {
        return "Mac 2018";
    }

    public String getOsName() {
        return "Mac OS";
    }
}
