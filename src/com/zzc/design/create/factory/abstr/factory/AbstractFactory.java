package com.zzc.design.create.factory.abstr.factory;

import com.zzc.design.create.factory.abstr.color.Color;
import com.zzc.design.create.factory.abstr.shape.Shape;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    /**
     * 获得颜色元素
     * @param color color
     * @return Color
     */
    public abstract Color getColor(String color);

    /**
     * 获得形状元素
     * @param shape shape
     * @return Shape
     */
    public abstract Shape getShape(String shape);

}
