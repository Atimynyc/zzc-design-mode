package com.zzc.design.create.singleton.hungry;

/**
 * 饿汉式，等不及了，就像你很饿去餐厅，心里期盼着一到餐厅，桌上就已经有菜肴可以吃了。
 * 由于饿汉式在一开始就初始化了，没有线程安全的问题。
 *
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public HungrySingleton getInstance() {
        return instance;
    }

}
