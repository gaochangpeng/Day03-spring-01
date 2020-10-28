package com.peng.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Component（三层以外的使用）
 *  作用：往容器中注册对象，在类上使用（将该类创建对象交给容器）
 *  value：给容器中bean指定名字，如果不指定，则类名首字母小写
 *
 * @Service 声明在Service层
 * @Reposition 声明在dao层
 * @Controller 声明在控制层
 */

// 采用注解的形式注入对象 Component
@Component("product")   // 类名首字母小写
@Data   // @Data：注解提供了一些getter等方法（省略了getter setter等方法，就不需要自己手动添加）
public class Product {
    private String name;        // 名字
    private BigDecimal price;   // 价格
}
