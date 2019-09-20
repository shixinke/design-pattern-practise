package com.shixinke.practise.design.pattern.creation.singleton;

import com.shixinke.practise.design.pattern.creation.singleton.annotation.NotRecommend;
import com.shixinke.practise.design.pattern.creation.singleton.annotation.ThreadSafe;

/**
 * 饿汉式
 * @author shixinke
 */
@ThreadSafe
@NotRecommend
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

}
