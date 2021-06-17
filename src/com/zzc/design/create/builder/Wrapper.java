package com.zzc.design.create.builder;

/**
 * 包装袋
 * 继承食物包装
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
