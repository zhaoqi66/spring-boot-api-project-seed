package com.conpany.project;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   15:59
 *
 * 抽象工厂: 构建器，工厂方法和工厂 创建设计模式的三剑客
 * 在BeanFactory的实现中，我们可以区分：ClassPathXmlApplicationContext，XmlWebApplicationContext，
 * StaticWebApplicationContext，StaticPortletApplicationContext，GenericApplicationContext，StaticApplicationContext。
 *
 **/
public class FactoryTest {

    // Test method which is the client
    @Test
    public void test() {
        Kitchen factory = new KitchenFactory();
        KitchenMeal meal = factory.getMeal("P.1");
        KitchenMeal dessert = factory.getDessert("I.1");
        assertTrue("Meal's name should be 'protein meal' and was '"+meal.getName()+"'", meal.getName().equals("protein meal"));
        assertTrue("Dessert's name should be 'ice-cream' and was '"+dessert.getName()+"'", dessert.getName().equals("ice-cream"));
    }
}
// abstract factory

abstract class Kitchen {
    public abstract KitchenMeal getMeal(String preferency);
    public abstract KitchenMeal getDessert(String preferency);
}
// concrete factory

class KitchenFactory extends Kitchen {
    @Override
    public KitchenMeal getMeal(String preferency) {
        if (preferency.equals("F.1")) {
            return new FastFoodMeal();
        } else if (preferency.equals("P.1")) {
            return new ProteinMeal();
        }
        return new VegetarianMeal();
    }
    @Override
    public KitchenMeal getDessert(String preferency) {
        if (preferency.equals("I.1")) {
            return new IceCreamMeal();
        }
        return null;
    }
}
// abstract product

abstract class KitchenMeal {
    public abstract String getName();
}

// concrete products

class ProteinMeal extends KitchenMeal {
    @Override
    public String getName() {
        return "protein meal";
    }
}

class VegetarianMeal extends KitchenMeal {
    @Override
    public String getName() {
        return "vegetarian meal";
    }
}

class FastFoodMeal extends KitchenMeal {
    @Override
    public String getName() {
        return "fast-food meal";
    }
}

class IceCreamMeal extends KitchenMeal {
    @Override
    public String getName() {
        return "ice-cream";
    }
}