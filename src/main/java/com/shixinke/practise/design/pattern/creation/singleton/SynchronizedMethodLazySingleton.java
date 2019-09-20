package com.shixinke.practise.design.pattern.creation.singleton;

import com.shixinke.practise.design.pattern.creation.singleton.annotation.NotRecommend;
import com.shixinke.practise.design.pattern.creation.singleton.annotation.ThreadSafe;

/**
 * 懒汉式
 * @author shixinke
 */
@ThreadSafe
@NotRecommend
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
