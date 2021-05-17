package com.zzc.design.factory.abstr.factory;

import com.zzc.design.factory.abstr.color.Color;
import com.zzc.design.factory.abstr.shape.Circle;
import com.zzc.design.factory.abstr.shape.Rectangle;
import com.zzc.design.factory.abstr.shape.Shape;
import com.zzc.design.factory.abstr.shape.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null || shape.equals("")) {
            return null;
        } else if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        } else {
            return null;
        }
    }
}
