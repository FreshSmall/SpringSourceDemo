package cn.com.extension.aware.applicationContextAware;


import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public void sayHello(){
        System.out.println("测试applicationContextAware，你好");
    }
}
