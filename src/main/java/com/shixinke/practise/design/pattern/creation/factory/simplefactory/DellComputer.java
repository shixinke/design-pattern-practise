package com.shixinke.practise.design.pattern.creation.factory.simplefactory;

/**
 * 戴尔电脑
 * @author shixinke
 */
public class DellComputer implements Computer {
    public String getName() {
        return "戴尔(DELL)";
    }

    public String getOsName() {
        return "Windows 7";
    }
}
