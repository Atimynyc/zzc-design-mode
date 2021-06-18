package com.zzc.design.create.prototype;

/**
 * 长方形 继承 形状接口
 */
public class PrototypeRectangle extends PrototypeShape {

    public PrototypeRectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
