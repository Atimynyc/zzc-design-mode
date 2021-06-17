package com.zzc.design.create.singleton.lazy;

/**
 * 双重校验锁（DCL，即double-checked locking）
 * 双重校验锁相较于懒汉式 + 线程安全来说，提升了性能，它不会每次都将方法锁住，只会第一次初始化的时候锁住这个单例。
 */
public class DCLSingleton {
    // 这里需要有个volatile关键字，防止初始化对象的时候重排序了，导致开拓对象空间提前于生成对象，
    // 这样会导致一个线程在初始化对象。另一个线程发现这个对象的空间都已经有了，去拿后发现这个空间里面啥东西都没有，会导致拿到一个null
    private volatile static DCLSingleton dclSingleton;
    private DCLSingleton(){}

    public static DCLSingleton getDclSingleton() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }

}
