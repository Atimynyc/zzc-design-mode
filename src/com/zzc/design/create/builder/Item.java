package com.zzc.design.create.builder;

/**
 * 表示实物条目
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
