package com.conpany.project;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/12   10:30
 *
 * 命令模式:
 * 后置处理器bean(是指实现 BeanFactoryPostProcessor接口)是命令，
 * org.springframework.context.support.PostProcessorRegistrationDelegate是调用者
 * (它执行 postProcessBeanFactory方法注册所有的后置处理器bean，此处看下面第二段代码)
 * 和接收器org.springframework.beans.factory.config.ConfigurableListableBeanFactory可以在元素（bean）
 * 构造初始化之前修改它们（例如：在初始化bean之前可以更改属性）
 **/
public class CommandTest {

    // This test method is a client
    @Test
    public void test() {
        Administrator admin = new Administrator();
        Server server = new Server();
        // start Apache
        admin.setCommand(new StartApache(server));
        admin.typeEnter();
        // start Tomcat
        admin.setCommand(new StartTomcat(server));
        admin.typeEnter();
        // check executed commands
        int executed = server.getExecutedCommands().size();
        assertTrue("Two commands should be executed but only "+
                executed+ " were", executed == 2);
    }
}

// commands

abstract class ServerCommand {
    protected Server server;
    public ServerCommand(Server server) {
        this.server = server;
    }
    public abstract void execute();
}

class StartTomcat extends ServerCommand {
    public StartTomcat(Server server) {
        super(server);
    }
    @Override
    public void execute() {
        server.launchCommand("sudo service tomcat7 start");
    }
}

class StartApache extends ServerCommand {
    public StartApache(Server server) {
        super(server);
    }
    @Override
    public void execute() {
        server.launchCommand("sudo service apache2 start");
    }
}

// invoker

class Administrator {
    private ServerCommand command;
    public void setCommand(ServerCommand command) {
        this.command = command;
    }
    public void typeEnter() {
        this.command.execute();
    }
}

// receiver

class Server {
    // as in common terminals, we store executed commands in history
    private List<String> executedCommands = new ArrayList<String>();
    public void launchCommand(String command) {
        System.out.println("Executing: "+command+" on server");
        this.executedCommands.add(command);
    }
    public List<String> getExecutedCommands() {
        return this.executedCommands;
    }
}