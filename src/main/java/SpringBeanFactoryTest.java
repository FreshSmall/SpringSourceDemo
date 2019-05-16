import cn.com.bean.Car;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Type;

public class SpringBeanFactoryTest {

    private static final Gson gson = new GsonBuilder().serializeNulls().create();

    private static final Gson gson1 = new Gson();

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car.getName());
        System.out.println(car.getPrice());
		/*Car car = new Car();
		System.out.println(gson.toJson(car));
		System.out.println(gson1.toJson(null));*/
    }
}
