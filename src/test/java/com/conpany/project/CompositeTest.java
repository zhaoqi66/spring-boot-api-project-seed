package com.conpany.project;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author Jiu
 * @description：TODO
 * @date 2020/08/11   17:03
 *
 * TODO 策略模式没有
 * 复合模式:
 *在 Spring世界中，我们检索复合对象的概念是org.springframework.beans.BeanMetadataElement接口，
 * 用于配置 bean对象。它是所有继承对象的基本界面。现在，在一方面，我们有一个叶子，
 * 由org.springframework.beans.factory.parsing.BeanComponentDefinition表示，
 * 另一边是复合org.springframework.beans.factory.parsing.CompositeComponentDefinition。
 * CompositeComponentDefinition类似于组件，因为它包含addNestedComponent（ComponentDefinition component）方法，
 * 它允许将叶添加到私有final列表中 nestedComponents。您可以看到，由于此列表， BeanComponentDefinition和
 * CompositeComponentDefinition的组件是org.springframework.beans.factory.parsing.ComponentDefinition。
 **/
public class CompositeTest {
    @Test
    public void test() {
        TextTagComposite composite = new PTag();
        composite.addTag(new SpanTag());
        composite.addTag(new EmTag());
        // sample client code
        composite.startWrite();
        for (TextTag leaf : composite.getTags()) {
            leaf.startWrite();
            leaf.endWrite();
        }
        composite.endWrite();
        assertTrue("Composite should contain 2 tags but it contains "+composite.getTags().size(), composite.getTags().size() == 2);
    }
}

interface TextTag {
    public void startWrite();
    public void endWrite();
}

interface TextTagComposite extends TextTag {
    public List<TextTag> getTags();
    public void addTag(TextTag tag);
}

class PTag implements TextTagComposite {
    private List<TextTag> tags = new ArrayList<TextTag>();
    @Override
    public void startWrite() {
        System.out.println("<p>");
    }
    @Override
    public void endWrite() {
        System.out.println("</p>");
    }
    @Override
    public List<TextTag> getTags() {
        return tags;
    }
    @Override
    public void addTag(TextTag tag) {
        tags.add(tag);
    }
}

class SpanTag implements TextTag {
    @Override
    public void startWrite() {
        System.out.println("<span>");
    }
    @Override
    public void endWrite() {
        System.out.println("</span>");
    }
}

class EmTag implements TextTag {
    @Override
    public void startWrite() {
        System.out.println("<em>");
    }
    @Override
    public void endWrite() {
        System.out.println("</em>");
    }
}
