package com.zzc.design.create.builder;

/**
 * 瓶子
 * 继承食物包装
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}
