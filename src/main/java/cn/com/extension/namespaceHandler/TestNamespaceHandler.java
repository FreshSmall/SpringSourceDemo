package cn.com.extension.namespaceHandler;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class TestNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("application",new TestBeanDefinitionParser());
    }

}
