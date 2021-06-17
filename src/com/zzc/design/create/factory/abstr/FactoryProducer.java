package com.zzc.design.create.factory.abstr;

import com.zzc.design.create.factory.abstr.factory.AbstractFactory;
import com.zzc.design.create.factory.abstr.factory.ColorFactory;
import com.zzc.design.create.factory.abstr.factory.ShapeFactory;

/**
 * 工厂生成类
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if ("SHAPE".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }

}
