package com.zzc.design.create.builder;

/**
 * 蔬菜汉堡
 */
public class VegBurger extends Burger{

    /**
     * 蔬菜汉堡价格25
     * @return float
     */
    @Override
    public float price() {
        return 25.0f;
    }

    /**
     * 蔬菜汉堡名称
     * @return String
     */
    @Override
    public String name() {
        return "Veg Burger";
    }
}
