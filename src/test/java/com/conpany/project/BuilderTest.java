package com.conpany.project;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   15:17
 *
 * 建设者模式  主要在创建对象的时候使用比较方便,配合@Builder注解使用更加方便
 * 在Spring中，我们可以在org.springframework.beans.factory.support.BeanDefinitionBuilder
 * 类中检索这个逻辑。这是一个允许我们以编程方式定义bean的类。我们可以在关于bean工厂后处理器的文章中看到它，
 * BeanDefinitionBuilder包含几个方法，它们为AbstractBeanDefinition抽象类的相关实现设置值，比如作用域，工厂方法，属性等。
 **/
public class BuilderTest {
    @Test
    public void test() {
        Programmer programmer = new Programmer
                .ProgrammerBuilder()
                .setFirstName("F").setLastName("L")
                .setCity("City").setZipCode("0000A").setAddress("Street 39")
                .setLanguages(new String[]{"bash", "Perl"})
                .setProjects(new String[]{"Linux kernel"}).build();
        assertTrue("Programmer should be 'F L' but was '" + programmer + "'",
                programmer.toString().equals("F L"));
    }
}
class Programmer {

    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String city;
    private String[] languages;
    private String[] projects;

    //满参构造
    private Programmer(String fName, String lName, String addr, String zip, String city, String[] langs, String[] projects) {
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.zipCode = zip;
        this.city = city;
        this.languages = langs;
        this.projects = projects;
    }
    // Builder
    public static class ProgrammerBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String zipCode;
        private String city;
        private String[] languages;
        private String[] projects;
        public ProgrammerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public ProgrammerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public ProgrammerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public ProgrammerBuilder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public ProgrammerBuilder setCity(String city) {
            this.city = city;
            return this;
        }
        public ProgrammerBuilder setLanguages(String[] languages) {
            this.languages = languages;
            return this;
        }
        public ProgrammerBuilder setProjects(String[] projects) {
            this.projects = projects;
            return this;
        }
        public Programmer build() {
            return new Programmer(firstName, lastName, address, zipCode, city, languages, projects);
        }
    }
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
