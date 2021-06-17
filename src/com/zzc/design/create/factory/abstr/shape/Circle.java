package com.zzc.design.create.factory.abstr.shape;

/**
 * 圆形
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am circle");
    }
}
