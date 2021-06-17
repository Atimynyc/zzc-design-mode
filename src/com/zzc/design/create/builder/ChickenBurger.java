package com.zzc.design.create.builder;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    /**
     * 鸡肉汉堡价格50f
     * @return float
     */
    @Override
    public float price() {
        return 50.0f;
    }

    /**
     * 鸡肉汉堡名称
     * @return String
     */
    @Override
    public String name() {
        return "Chicken Burger";
    }
}
