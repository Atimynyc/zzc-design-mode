package com.zzc.design.factory.abstr.shape;

/**
 * 长方形
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am rectangle");
    }
}
