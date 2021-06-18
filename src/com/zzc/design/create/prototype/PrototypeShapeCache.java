package com.zzc.design.create.prototype;

import java.util.Hashtable;

/**
 * 创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中。
 */
public class PrototypeShapeCache {

    private static Hashtable<String, PrototypeShape> shapeMap = new Hashtable<>();

    public static PrototypeShape getShape(String shapeId) {
        PrototypeShape cachedShape = shapeMap.get(shapeId);
        return (PrototypeShape) cachedShape.clone();
    }

    /**
     * 模拟从数据库load数据
     */
    public static void loadCache() {
        PrototypeCircle circle = new PrototypeCircle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        PrototypeSquare square = new PrototypeSquare();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        PrototypeRectangle rectangle = new PrototypeRectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
