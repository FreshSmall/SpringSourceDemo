package cn.com.extension.namespaceHandler;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class TestBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(TestConfig.class);
        beanDefinition.setLazyInit(false);
        String id = element.getAttribute("id");
        beanDefinition.getPropertyValues().add("id",id);
        beanDefinition.getPropertyValues().add("name",element.getAttribute("name"));
        beanDefinition.getPropertyValues().add("version",element.getAttribute("version"));
        beanDefinition.getPropertyValues().add("owner",element.getAttribute("owner"));
        beanDefinition.getPropertyValues().add("organization",element.getAttribute("organization"));
        parserContext.getRegistry().registerBeanDefinition(id,beanDefinition);
        return beanDefinition;
    }
}
