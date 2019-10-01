package com.shixinke.practise.design.pattern.content.creation.singleton;


/**
 * 懒汉式
 * @author shixinke
 */
public class DoubleCheckLazySingleton {

    private volatile static DoubleCheckLazySingleton INSTANCE;

    private DoubleCheckLazySingleton() {

    }

    public static DoubleCheckLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized(DoubleCheckLazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLazySingleton();
                }
                return INSTANCE;
            }
        }
        return INSTANCE;
    }

}
