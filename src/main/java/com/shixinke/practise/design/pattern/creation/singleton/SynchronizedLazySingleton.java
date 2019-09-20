package com.shixinke.practise.design.pattern.creation.singleton;

import com.shixinke.practise.design.pattern.creation.singleton.annotation.NonThreadSafe;
import com.shixinke.practise.design.pattern.creation.singleton.annotation.NotRecommend;
import com.shixinke.practise.design.pattern.creation.singleton.annotation.ThreadSafe;

/**
 * 懒汉式
 * @author shixinke
 */
@ThreadSafe
@NotRecommend
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
