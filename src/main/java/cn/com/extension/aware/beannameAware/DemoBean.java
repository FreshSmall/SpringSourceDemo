package cn.com.extension.aware.beannameAware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


@Component
public class DemoBean implements BeanNameAware {

    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName(){
        return beanName;
    }
}
