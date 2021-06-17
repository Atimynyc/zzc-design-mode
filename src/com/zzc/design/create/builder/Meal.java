package com.zzc.design.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐
 */
public class Meal {

    /**
     * 套餐里面的食物列表
     */
    private List<Item> items = new ArrayList<>();

    /**
     * 添加食物
     * @param item item
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 计算套餐的价格
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 查看套餐内容
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
