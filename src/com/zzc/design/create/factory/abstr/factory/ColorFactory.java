package com.zzc.design.create.factory.abstr.factory;

import com.zzc.design.create.factory.abstr.color.Color;
import com.zzc.design.create.factory.abstr.color.Green;
import com.zzc.design.create.factory.abstr.color.Red;
import com.zzc.design.create.factory.abstr.color.Yellow;
import com.zzc.design.create.factory.abstr.shape.Shape;

/**
 * 颜色工厂
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null || color.equals("")) {
            return null;
        } else if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("Yellow".equalsIgnoreCase(color)) {
            return new Yellow();
        } else if ("Green".equalsIgnoreCase(color)) {
            return new Green();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
