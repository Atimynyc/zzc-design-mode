package com.zzc.design.factory.abstr.color;

/**
 * 红色
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("I am red");
    }
}
