package com.zzc.design.create.prototype;

/**
 * 正方形
 */
public class PrototypeSquare extends PrototypeShape {
    public PrototypeSquare() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
