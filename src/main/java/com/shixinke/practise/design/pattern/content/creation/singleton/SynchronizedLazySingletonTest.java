package com.shixinke.practise.design.pattern.content.creation.singleton;

class SynchronizedLazyRunnable implements Runnable {

    public void run() {
        System.out.println( SynchronizedLazySingleton.getInstance());
    }
}

/**
 * 懒汉式测试
 * @author shixinke
 */
public class SynchronizedLazySingletonTest {


    public static void singleThread() {
        SynchronizedLazySingleton ls1 =  SynchronizedLazySingleton.getInstance();
        SynchronizedLazySingleton ls2 =  SynchronizedLazySingleton.getInstance();
        System.out.println(ls1);
        System.out.println(ls2);
    }

    public static void main(String[] args) {
        //singleThread();

        new Thread(new SynchronizedLazyRunnable()).start();
        new Thread(new SynchronizedLazyRunnable()).start();
        new Thread(new SynchronizedLazyRunnable()).start();
    }
}

