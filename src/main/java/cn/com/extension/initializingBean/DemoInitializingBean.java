package cn.com.extension.initializingBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DemoInitializingBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("测试bean执行，afterProperties");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean执行，destroy");
    }

    public void init(){
        System.out.println("测试bean执行，init");
    }

    public void close(){
        System.out.println("测试bean执行，close");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("测试bean执行，postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("测试bean执行，preDestroy");
    }

}
