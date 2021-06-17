package com.zzc.design.create.builder;

/**
 * 可乐
 */
public class Coke extends ColdDrink{
    /**
     * 可乐名称
     * @return String
     */
    @Override
    public String name() {
        return "Coke";
    }

    /**
     * 可乐价格30f
     * @return float
     */
    @Override
    public float price() {
        return 30.0f;
    }
}
