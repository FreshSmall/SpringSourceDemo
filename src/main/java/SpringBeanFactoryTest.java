import cn.com.bean.Car;
import cn.com.extension.applicationListener.UserService;
import cn.com.extension.aware.applicationContextAware.DemoApplicationContext;
import cn.com.extension.aware.applicationContextAware.HelloService;
import cn.com.extension.aware.beanfactoryAware.DemoBeanFactory;
import cn.com.extension.aware.beannameAware.DemoBean;
import cn.com.extension.factoryBean.DemoFactoryBean;
import cn.com.extension.namespaceHandler.TestConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Type;

public class SpringBeanFactoryTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        /**
         * namespaceHandler扩展测试
         */
        TestConfig testConfig = (TestConfig) ctx.getBean("testApplication");
        System.out.println(testConfig);

        /**
         * applicationListener扩展测试
         */
        UserService userService = (UserService) ctx.getBean("userService");
        userService.register("测试地址");


        /**
         * applicationContextAware扩展测试
         */
        DemoApplicationContext demoApplicationContext = (DemoApplicationContext) ctx.getBean("demoApplicationContext");
        ApplicationContext applicationContext = demoApplicationContext.getApplicationContext();
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        helloService.sayHello();

        /**
         * beanfactoryaware扩展测试
         */
        DemoBeanFactory demoBeanFactory = (DemoBeanFactory) ctx.getBean("demoBeanFactory");
        BeanFactory beanFactory = demoBeanFactory.getBeanFactory();
        HelloService hello = (HelloService) beanFactory.getBean("helloService");
        hello.sayHello();

        /**
         * beanNameAware扩展测试
         */
        DemoBean demoBean = (DemoBean) ctx.getBean("demoBean");
        System.out.println("DemoBean的beanName："+demoBean.getBeanName());

        /**
         * factoryBean扩展测试
         */
        Object demoFactoryBean = ctx.getBean("demoFactoryBean");
        System.out.println(demoFactoryBean);


    }
}
