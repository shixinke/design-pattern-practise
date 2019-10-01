package com.shixinke.practise.design.pattern.content.creation.factory.simplefactory;

/**
 * thinkPad电脑
 * @author shixinke
 */
public class ThinkPadComputer implements Computer {
    public String getName() {
        return "ThinkPad";
    }

    public String getOsName() {
        return "Windows 10";
    }
}
