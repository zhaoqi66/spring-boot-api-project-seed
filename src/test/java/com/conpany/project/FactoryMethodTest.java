package com.conpany.project;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   15:47
 *
 * 工厂模式 : 允许通过公共静态方法对象进行初始化，称为工厂方法
 **/
public class FactoryMethodTest {
    @Test
    public void test() {
        Meal fruit = Meal.valueOf("banana");
        Meal vegetable = Meal.valueOf("carrot");
        assertTrue("Banana should be a fruit but is "+fruit.getType(), fruit.getType().equals("fruit"));
        assertTrue("Carrot should be a vegetable but is "+vegetable.getType(), vegetable.getType().equals("vegetable"));
    }
}

class Meal {
    private String type;
    public Meal(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
    // Example of factory method - different object is created depending on current context
    public static Meal valueOf(String ingredient) {
        if (ingredient.equals("banana")) {
            return new Meal("fruit");
        }
        return new Meal("vegetable");
    }
}
