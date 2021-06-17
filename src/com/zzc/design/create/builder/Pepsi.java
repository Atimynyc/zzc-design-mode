package com.zzc.design.create.builder;

/**
 * 百事可乐
 */
public class Pepsi extends ColdDrink{
    /**
     * 百事可乐名称
     * @return String
     */
    @Override
    public String name() {
        return "Pepsi";
    }

    /**
     * 百事可乐价格
     * @return float
     */
    @Override
    public float price() {
        return 35.0f;
    }
}
