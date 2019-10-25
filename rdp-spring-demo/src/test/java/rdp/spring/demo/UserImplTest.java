package rdp.spring.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class UserImplTest {

    @Test
    public void getName() {
        //创建
        //ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //从容器中获取bean的实例
        //方式1：根据类型容器中获取bean实例
        //User service1 = context.getBean(User.class);

        /*System.out.println(service1.hashCode());

        User service2 = context.getBean(User.class);
        System.out.println(service2.hashCode());

        System.out.println(service1.equals(service2));

        System.out.println(service1.getName());*/


    }
}