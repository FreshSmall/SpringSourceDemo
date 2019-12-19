package cn.com.extension.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


@Component
public class Demo2BeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
        System.out.println("2==bean name :" + beanName + ",before Initialization," + object.toString());
        return object;
    }

    @Override
    public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
        System.out.println("2==bean name:" + beanName + ",after Initialization," + object);
        return object;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
