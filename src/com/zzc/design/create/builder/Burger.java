package com.zzc.design.create.builder;

/**
 * Burger 汉堡
 * 创建Item接口抽象类，该接口提供默认的功能
 */
public abstract class Burger implements Item {

    /**
     * 汉堡是用包装纸包装的，其次，由于汉堡一定是用包装纸包装的因此这里可以直接实现这个方法
     * @return Wrapper
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 由于价格是不确定，不同的汉堡有不同的价格，因此这里返回价格的方法具体实现还要看是什么汉堡
     * @return float
     */
    @Override
    public abstract float price();

}
