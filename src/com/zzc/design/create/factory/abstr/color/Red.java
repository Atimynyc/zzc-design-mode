package com.zzc.design.create.factory.abstr.color;

/**
 * 红色
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("I am red");
    }
}
