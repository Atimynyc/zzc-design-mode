package com.zzc.design.factory.abstr;

import com.zzc.design.factory.abstr.factory.AbstractFactory;
import com.zzc.design.factory.abstr.factory.ColorFactory;
import com.zzc.design.factory.abstr.factory.ShapeFactory;

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
