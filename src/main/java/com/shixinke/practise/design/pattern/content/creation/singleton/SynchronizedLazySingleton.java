package com.shixinke.practise.design.pattern.content.creation.singleton;


/**
 * 懒汉式
 * @author shixinke
 */

public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton INSTANCE;

    private SynchronizedLazySingleton() {

    }

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizedLazySingleton();
        }
        return INSTANCE;
    }

}
