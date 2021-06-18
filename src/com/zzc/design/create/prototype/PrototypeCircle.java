package com.zzc.design.create.prototype;

/**
 * 圆形 继承 形状接口
 */
public class PrototypeCircle extends PrototypeShape{

    public PrototypeCircle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
