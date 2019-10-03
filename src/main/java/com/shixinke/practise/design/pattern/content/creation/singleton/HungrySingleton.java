package com.shixinke.practise.design.pattern.content.creation.singleton;


import java.io.Serializable;

/**
 * 饿汉式
 * @author shixinke
 */

public class HungrySingleton implements Serializable  {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        /**
         * 添加判断
         */
        if (INSTANCE != null) {
            throw new RuntimeException("单例类不能被反射");
        }
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
