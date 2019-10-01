package com.shixinke.practise.design.pattern.content.creation.factory.simplefactory;

/**
 * 电脑工厂
 */
public class ComputerFactory {

    /**
     * 生产电脑的方法
     * @param name
     * @return
     */
    public static Computer getComputer(String name) {
        if ("Dell".equalsIgnoreCase(name)) {
            return new DellComputer();
        } else if ("Mac".equalsIgnoreCase(name)) {
            return new MacComputer();
        } else if ("ThinkPad".equalsIgnoreCase(name)) {
            return new ThinkPadComputer();
        }
        return null;
    }
}
