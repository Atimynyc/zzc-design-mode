package com.zzc.design.create.builder;

/**
 * 生成套餐
 */
public class MealBuilder {

    /**
     * 套餐1：蔬菜汉堡+可乐
     * @return Meal
     */
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 套餐2：鸡肉汉堡+百事可乐
     * @return Meal
     */
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
