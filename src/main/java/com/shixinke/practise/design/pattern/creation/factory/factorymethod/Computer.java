package com.shixinke.practise.design.pattern.creation.factory.factorymethod;

/**
 * 抽象电脑类
 * @author shixinke
 */
public interface Computer {
    /**
     * 获取电脑的名称(型号)
     * @return
     */
    String getName();

    /**
     * 获取操作系统名称
     * @return
     */
    String getOsName();
}
