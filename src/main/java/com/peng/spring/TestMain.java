package com.peng.spring;

import com.peng.spring.bean.Product;
import com.peng.spring.bean.User;
import com.peng.spring.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        // 配置文件
        String path = "classpath:spring-context.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);

        // 采用XML形式注入对象
        /*User user = applicationContext.getBean("user", User.class);
        System.out.println(user.toString());

        // 执行close之后才会执行 destroy 这个方法
        applicationContext.close();*/


        // 使用注解的形式来注入对象（使用注解注入对象，一定都得要 开启注解注入）
        /*Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product.toString());*/

        UserController userController = applicationContext.getBean("userController", UserController.class);
        System.out.println("我是controller：" + userController);
        System.out.println("我是service："+userController.userService);

    }
}
