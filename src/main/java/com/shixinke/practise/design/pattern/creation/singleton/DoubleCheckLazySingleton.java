package com.shixinke.practise.design.pattern.creation.singleton;

import com.shixinke.practise.design.pattern.creation.singleton.annotation.NotRecommend;
import com.shixinke.practise.design.pattern.creation.singleton.annotation.ThreadSafe;

/**
 * 懒汉式
 * @author shixinke
 */
@ThreadSafe
@NotRecommend
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
