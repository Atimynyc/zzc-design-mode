package com.zzc.design.create.prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        PrototypeShapeCache.loadCache();

        PrototypeShape cloneShape = PrototypeShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape.getType());

        PrototypeShape cloneShape2 = PrototypeShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape2.getType());

        PrototypeShape cloneShape3 = PrototypeShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape3.getType());

    }

}
