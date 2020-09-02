package com.conpany.project;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   17:53
 *
 * 观察者模式:
 * 我们可以从关于Spring和JBoss的处理接口这里找到一个很好的例子，它包含在org.springframework.instrument.classloading.jboss包中。
 * 我们检索 JBossLoadTimeWeaver类负责 JBoss容器的编织管理。然而，类加载器对于 JBoss6（使用 JBossMCAdapter实例）和
 * JBoss7/8（使用 JBossModulesAdapter实例）是不同的。根据 JBoss版本，我们在 JBossLoadTimeWeaver构造函数中初始化相应的适配器
 * （与我们示例中的 Drill的构造函数完全相同）
 **/
public class ObserverTest {

    @Test
    public void test() {
        Observer pageOpener = new PageOpener();
        Observer register = new Register();
        Button btn = new Button();
        btn.addListener(pageOpener);
        btn.addListener(register);
        btn.clickOn();
        assertTrue("Button should be clicked but it wasn't",
                btn.wasClicked());
        assertTrue("Page opener should be informed about click but it wasn't",
                pageOpener.wasInformed());
        assertTrue("Register should be informed about click but it wasn't",
                register.wasInformed());
    }
}

class Button {
    private boolean clicked;
    private List<Observer> listeners;
    public List<Observer> getListeners() {
        if (this.listeners == null) {
            this.listeners = new ArrayList<Observer>();
        }
        return this.listeners;
    }
    public void addListener(Observer observer) {
        getListeners().add(observer);
    }
    public boolean wasClicked() {
        return this.clicked;
    }
    public void clickOn() {
        this.clicked = true;
        informAll();
    }
    private void informAll() {
        for (Observer observer : getListeners()) {
            observer.informAboutEvent();
        }
    }
}

abstract class Observer {

    protected boolean informed;

    public void informAboutEvent() {

        this.informed = true;

    }

    public boolean wasInformed() {

        return this.informed;

    }

}

class PageOpener extends Observer {

    @Override

    public void informAboutEvent() {

        System.out.println("Preparing download of new page");

        super.informAboutEvent();

    }

}

class Register extends Observer {

    @Override

    public void informAboutEvent() {

        System.out.println("Adding the action to register");

        super.informAboutEvent();

    }

}