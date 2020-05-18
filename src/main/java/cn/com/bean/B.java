package cn.com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : yinchao
 * @create 2020/5/15 3:41 下午
 */
@Component
public class B {

    @Autowired
    private A a;

    private String name = "A类中的名称";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + a.getName() + '\'' +
                '}';
    }
}
