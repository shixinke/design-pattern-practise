package com.shixinke.practise.design.pattern.content.creation.factory.simplefactory;

/**
 * 电脑(接口)
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
