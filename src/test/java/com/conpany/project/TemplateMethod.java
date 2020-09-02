package com.conpany.project;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   17:26
 *
 * 模板模式:
 * Spring在org.springframework.context.support.AbstractApplicationContext类中使用模板方法。
 * 他们不是一个模板方法（在我们的例子中是construct ），而是多个。例如，getsFreshBeanFactory返回内部 bean工厂的新版本，
 * 调用两个抽象方法： refreshBeanFactory（刷新工厂bean）和 getBeanFactory（以获取更新的工厂bean）。
 * 这个方法和其他一些方法一样，用在public void refresh()中，抛出构造应用程序上下文的BeansException，
 * IllegalStateException方法(这里会在后面Spring中与应用程序上下文分析中再次提到)。
 *
 **/
public class TemplateMethod {
    public static void main(String[] args) {
        HouseAbstract house = new SeaHouse();
        house.construct();
    }
}

abstract class HouseAbstract {
    protected abstract void constructFoundations();
    protected abstract void constructWall();
    // template method
    public final void construct() {
        constructFoundations();
        constructWall();
    }
}

class EcologicalHouse extends HouseAbstract {
    @Override
    protected void constructFoundations() {
        System.out.println("Making foundations with wood");
    }
    @Override
    protected void constructWall() {
        System.out.println("Making wall with wood");
    }
}

class SeaHouse extends HouseAbstract {
    @Override
    protected void constructFoundations() {
        System.out.println("Constructing very strong foundations");
    }
    @Override
    protected void constructWall() {
        System.out.println("Constructing very strong wall");
    }
}