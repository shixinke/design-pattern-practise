package com.shixinke.practise.design.pattern.content.creation.singleton.destroy;

import com.shixinke.practise.design.pattern.content.creation.singleton.HungrySingleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射来破坏单例模式
 * @author shixinke
 */
public class ReflectDestroy {

    private static <T> void reflect(Object instance, Class<T> clazz) {
        try {
            Constructor constructor = clazz.getDeclaredConstructor();
            /**
             * 将构造方法设置成可访问的
             */
            constructor.setAccessible(true);
            T newInstance = (T) constructor.newInstance();

            System.out.println("instance:" + instance);
            System.out.println("newInstance:" + newInstance);
            System.out.println(instance == newInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        reflect(instance, HungrySingleton.class);

    }
}
