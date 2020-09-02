package com.conpany.project;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   9:21
 * 适配器模式  (第一人称视角)
 * 拿一个现实中的例子进行说明，想象一下你想要用电钻来钻一个洞。要钻一个小洞，你会使用小钻头，钻一个大的需要用大钻头.
 * Spring使用适配器设计模式来处理不同servlet容器中的加载时编织(load-time-weaving)。在面向切面编程（AOP）
 * 中使用load-time-weaving，一种方式是在类加载期间将AspectJ的方面注入字节码。另一种方式是对类进行编译时注入
 * 或对已编译的类进行静态注入。
 * <p>
 * 我们检索 JBossLoadTimeWeaver类负责 JBoss容器的编织管理。然而，类加载器对于 JBoss6（使用 JBossMCAdapter实例）
 * 和 JBoss7/8（使用 JBossModulesAdapter实例）是不同的。根据 JBoss版本，我们在 JBossLoadTimeWeaver
 * 构造函数中初始化相应的适配器（与我们示例中的 Drill的构造函数完全相同）
 **/
public class AdapterTest {

    public static void main(String[] args) {
        HoleMaker maker = new HoleMakerImpl();
        maker.makeHole(1);
        maker.makeHole(2);
        maker.makeHole(30);
        maker.makeHole(40);
    }
}

interface HoleMaker {
    public void makeHole(int diameter);
}

interface DrillBit {
    public void makeSmallHole();

    public void makeBigHole();
}

// Two adaptee objects
class BigDrillBit implements DrillBit {
    @Override
    public void makeSmallHole() {
        // do nothing
    }

    @Override
    public void makeBigHole() {
        System.out.println("Big hole is made byt WallBigHoleMaker");
    }
}

class SmallDrillBit implements DrillBit {
    @Override
    public void makeSmallHole() {
        System.out.println("Small hole is made byt WallSmallHoleMaker");
    }

    @Override
    public void makeBigHole() {
        // do nothing
    }
}

// Client class 也是使用多态创建对应
class HoleMakerImpl implements HoleMaker {
    @Override
    public void makeHole(int diameter) {
        HoleMaker maker = new Drill(diameter);
        maker.makeHole(diameter);
    }
}

// Adapter class  重要  这里使用多态,通过参数创建对象,执行对应的方法
class Drill implements HoleMaker {
    private DrillBit drillBit;

    // 通过参数大小返回不同的对象
    public Drill(int diameter) {
        drillBit = getMakerByDiameter(diameter);
    }

    // 执行对应的方法
    @Override
    public void makeHole(int diameter) {
        if (isSmallDiameter(diameter)) {
            drillBit.makeSmallHole();
        } else {
            drillBit.makeBigHole();
        }
    }

    private DrillBit getMakerByDiameter(int diameter) {
        if (isSmallDiameter(diameter)) {
            return new SmallDrillBit();
        }
        return new BigDrillBit();
    }

    private boolean isSmallDiameter(int diameter) {
        return diameter < 10;
    }
}

