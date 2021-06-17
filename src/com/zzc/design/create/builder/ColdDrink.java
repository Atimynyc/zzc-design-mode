package com.zzc.design.create.builder;

/**
 * ColdDrink 冷饮
 * 创建Item接口抽象类，该接口提供默认的功能
 */
public abstract class ColdDrink implements Item {

    /**
     * 冷饮的包装用瓶子，冷饮一定用的是瓶子装
     * @return Bottle
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 由于价格是不确定，不同的冷饮有不同的价格，因此这里返回价格的方法具体实现还要看是什么冷饮
     * @return float
     */
    @Override
    public abstract float price();
}
