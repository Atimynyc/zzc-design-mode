package com.zzc.design.singleton.lazy;

/**
 * 懒汉式，线程安全
 * 这里的getInstance方法添加了synchronized关键字，指明该方法每次只能有一个线程去调用，实现线程安全
 */
public class LazySingletonWithThreadSafe {

    private static LazySingletonWithThreadSafe instance;
    private LazySingletonWithThreadSafe(){}

    public static synchronized LazySingletonWithThreadSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithThreadSafe();
        }
        return instance;
    }

}
