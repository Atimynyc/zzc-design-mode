package com.zzc.design.create.singleton.lazy;

/**
 * 懒汉式，线程不安全
 * 懒汉的意思是，等到要用的时候，才初始化该单例。（翻译过来就是不到deadline你是不会完成论文的）
 * 由于懒汉式是要在用的时候再初始化，你没法控制这个时候是不是两个人同时过来初始化，所以我们要考虑线程安全的问题。
 * 当两个线程同时进来，发现instance == null， 那么就会new 两次该单例
 */
public class LazySingletonWithoutThreadSafe {

    private static LazySingletonWithoutThreadSafe instance;

    private LazySingletonWithoutThreadSafe(){}

    public static LazySingletonWithoutThreadSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithoutThreadSafe();
        }
        return instance;
    }

}
