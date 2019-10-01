package com.shixinke.practise.design.pattern.content.creation.singleton;

/**
 * 懒汉式
 * @author shixinke
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
