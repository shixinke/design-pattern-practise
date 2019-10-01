package com.shixinke.practise.design.pattern.content.creation.factory.factorymethod;

/**
 * Dell电脑
 * @author shixinke
 */
public class DellComputer implements Computer {
    public String getName() {
        return "dell电脑";
    }

    public String getOsName() {
        return "windows 10";
    }
}
