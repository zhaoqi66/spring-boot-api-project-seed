package com.conpany.project;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/12   11:20
 *
 *  访问者模式:
 *  Spring在beans配置中实现了访问者设计模式。为了观察，我们可以看看
 *  org.springframework.beans.factory.config.BeanDefinitionVisitor对象，该对象用于
 *  解析bean元数据并将其解析为 String（例如：具有作用域或工厂方法名称的XML属性）或 Object
 *  （例如：构造函数定义中的参数）。已解析的值在与分析的bean关联的 BeanDefinition实例中进行判断设置。
 **/
public class VisitorTest {

    @Test
    public void test() {
        CarComponent car = new Car();
        Mechanic mechanic = new QualifiedMechanic();
        car.accept(mechanic);
        assertTrue("After qualified mechanics visit, the car should be broken",
                car.isBroken());
        Mechanic nonqualifiedMechanic = new NonQualifiedMechanic();
        car.accept(nonqualifiedMechanic);
        assertFalse("Car shouldn't be broken becase non qualified mechanic " +
                " can't see breakdowns", car.isBroken());
    }
}
// visitor 机械
interface Mechanic {
    public void visit(CarComponent element);
    public String getName();
}

// 合格
class QualifiedMechanic implements Mechanic {
    @Override
    public void visit(CarComponent element) {
        element.setBroken(true);
    }
    @Override
    public String getName() {
        return "qualified";
    }
}

// 不合格
class NonQualifiedMechanic implements Mechanic {
    @Override
    public void visit(CarComponent element) {
        element.setBroken(true);
    }
    @Override
    public String getName() {
        return "unqualified";
    }
}

// visitable
abstract class CarComponent {
    protected boolean broken;
    public abstract void accept(Mechanic mechanic);
    public void setBroken(boolean broken) {
        this.broken = broken;
    }
    public boolean isBroken() {
        return this.broken;
    }
}

class Car extends CarComponent {
    private boolean broken = false;
    private CarComponent[] components;
    public Car() {
        components = new CarComponent[]{
                new Wheels(), new Engine(), new Brake()
        };
    }

    @Override
    public void accept(Mechanic mechanic) {
        this.broken = false;
        if (mechanic.getName().equals("qualified")) {
            int i = 0;
            while (i < components.length && this.broken == false) {
                CarComponent component = components[i];
                mechanic.visit(component);
                this.broken = component.isBroken();
                i++;
            }
        }
        // if mechanic isn't qualified, we suppose that
        // he isn't able to see breakdowns and so
        // he considers the car as no broken
        // (even if the car is broken)
    }
    @Override
    public boolean isBroken() {
        return this.broken;
    }
}

class Wheels extends CarComponent {
    @Override
    public void accept(Mechanic mechanic) {
        mechanic.visit(this);
    }
}

class Engine extends CarComponent {
    @Override
    public void accept(Mechanic mechanic) {
        mechanic.visit(this);
    }
}

class Brake extends CarComponent {
    @Override
    public void accept(Mechanic mechanic) {
        mechanic.visit(this);
    }
}