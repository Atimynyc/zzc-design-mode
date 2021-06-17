package com.zzc.design.create.factory.abstr.shape;

/**
 * 正方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I am square");
    }
}
