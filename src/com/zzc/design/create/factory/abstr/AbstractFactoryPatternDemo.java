package com.zzc.design.create.factory.abstr;

import com.zzc.design.create.factory.abstr.color.Color;
import com.zzc.design.create.factory.abstr.factory.AbstractFactory;
import com.zzc.design.create.factory.abstr.shape.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 获得形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        assert shapeFactory != null;
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        // 获得颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        assert colorFactory != null;
        Color red = colorFactory.getColor("Red");
        red.fill();
        Color yellow = colorFactory.getColor("Yellow");
        yellow.fill();
        Color green = colorFactory.getColor("Green");
        green.fill();

    }

}
