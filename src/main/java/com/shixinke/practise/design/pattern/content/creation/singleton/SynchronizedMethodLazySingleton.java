package com.shixinke.practise.design.pattern.content.creation.singleton;

/**
 * 懒汉式
 * @author shixinke
 */
public class SynchronizedMethodLazySingleton {

    private static SynchronizedMethodLazySingleton INSTANCE;

    private SynchronizedMethodLazySingleton() {

    }

    public static  SynchronizedMethodLazySingleton getInstance() {
        synchronized(SynchronizedMethodLazySingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new SynchronizedMethodLazySingleton();
            }
            return INSTANCE;
        }
    }

}
