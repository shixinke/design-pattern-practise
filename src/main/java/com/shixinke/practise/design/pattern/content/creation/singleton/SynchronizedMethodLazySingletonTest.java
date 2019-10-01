package com.shixinke.practise.design.pattern.content.creation.singleton;

class SynchronizedMethodLazyRunnable implements Runnable {

    public void run() {
        System.out.println( SynchronizedMethodLazySingleton.getInstance());
    }
}

/**
 * 懒汉式测试
 * @author shixinke
 */
public class SynchronizedMethodLazySingletonTest {


    public static void singleThread() {
        SynchronizedMethodLazySingleton ls1 =  SynchronizedMethodLazySingleton.getInstance();
        SynchronizedMethodLazySingleton ls2 =  SynchronizedMethodLazySingleton.getInstance();
        System.out.println(ls1);
        System.out.println(ls2);
    }

    public static void main(String[] args) {
        //singleThread();

        new Thread(new SynchronizedMethodLazyRunnable()).start();
        new Thread(new SynchronizedMethodLazyRunnable()).start();
        new Thread(new SynchronizedMethodLazyRunnable()).start();
    }
}

