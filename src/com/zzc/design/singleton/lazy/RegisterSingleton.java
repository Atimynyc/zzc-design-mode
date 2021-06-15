package com.zzc.design.singleton.lazy;

/**
 * 登记式（使用静态内部类）
 * 内部类只有在外部类被调用才加载，产生单例时，又不用加锁，此模式有懒汉式 和饿汉式的优点，屏蔽了他们的缺点，是最好的单例模式。
 * 利用了 classloader 机制来保证初始化 instance 时只有一个线程。classLoader加载的时候是单线程的。
 */
public class RegisterSingleton {

    // 静态内部类的初始化在外部类之后
    // 静态内部类只有在被调用时才会加载
    private static class SingletonHolder {
        private static final RegisterSingleton INSTANCE = new RegisterSingleton();
    }

    private RegisterSingleton() {}

    public static RegisterSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
