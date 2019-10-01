package com.shixinke.practise.design.pattern.content.creation.singleton;

class LazyRunnable implements Runnable {

    public void run() {
        System.out.println(LazySingleton.getInstance());
    }
}

/**
 * 懒汉式测试
 * @author shixinke
 */
public class LazySingletonTest {


    public static void singleThread() {
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();
        System.out.println(ls1);
        System.out.println(ls2);
    }

    public static void main(String[] args) {
        //singleThread();

        new Thread(new LazyRunnable()).start();
        new Thread(new LazyRunnable()).start();
        new Thread(new LazyRunnable()).start();
    }
}
