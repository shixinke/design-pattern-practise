package com.shixinke.practise.design.pattern.creation.singleton;

import com.shixinke.practise.design.pattern.creation.singleton.annotation.NonThreadSafe;
import com.shixinke.practise.design.pattern.creation.singleton.annotation.NotRecommend;

/**
 * 懒汉式
 * @author shixinke
 */
@NonThreadSafe
@NotRecommend
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
