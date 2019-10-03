package com.shixinke.practise.design.pattern.content.creation.singleton.destroy;

import com.shixinke.practise.design.pattern.content.creation.singleton.HungrySingleton;

import java.io.*;

/**
 * 通过序列化的方式来破坏单例
 * @author shixinke
 */
public class SerializeDestroy {


    private static <T> void serialize(Object obj, Class<T> clazz) {
        String fileName = "singleton";
        try {
            /**
             * 将对象数据写入到文件中
             */
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();

            /**
             * 通过文件将对象读取出来
             */
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            T newInstance = (T) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("instance:"+obj);
            System.out.println("newInstance"+newInstance);
            System.out.println(obj == newInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        serialize(instance, HungrySingleton.class);
    }
}
