package com.conpany.project;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   17:41
 *
 * 原型模式:
 * 原型设计模式与有用相同名称的(prototype)作用域有点相似。此设计模式允许通过复制已存在的对象来创建一个对象的实例。
 * 副本应该是真正的副本。这意味着新对象的所有属性应与复制对象的属性相同。
 *
 * 在 Spring中，在org.springframework.beans.factory.support.AbstractBeanFactory
 * 中使用一种特定的原型设计模式，它将初始化 bean原型作用域。新对象基于配置文件中的bean定义。
 **/
public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Robot firstRobot = new Robot("Droid#1");
        Robot secondRobot = (Robot) firstRobot.clone();
        assertTrue("Cloned robot's instance can't be the same as the"
                        +" source robot instance",
                firstRobot != secondRobot);
        assertTrue("Cloned robot's name should be '"+firstRobot.getName()+"'"
                        +" but was '"+secondRobot.getName()+"'",
                secondRobot.getName().equals(firstRobot.getName()));
    }
}

class Robot implements Cloneable {
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}