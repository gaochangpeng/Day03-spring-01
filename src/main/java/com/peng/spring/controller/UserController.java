package com.peng.spring.controller;

import com.peng.spring.service.Impl.UserServiceImpl;
import com.peng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Component  // 注解形式注入对象
@Controller
public class UserController {
    /*

        @Resource(name = "userService", type = UserServiceImpl.class)
            不是spring的，而是 jre250 的，name为根据ID去容器中查找对象，type为根据类型查找依赖对象
        @Autowired(required = true)
            是spring自带的(默认的为required = true，表示对象必须存在，如果不存在就会报错，false不会报错，但是调用的时候会)
        @Qualifier("userService")
            （配合@Autowired使用）等同上面的，通过名字name查找，找不到再通过类型type去查找

        作用：都是引入容器中的其他对象
     */

    @Autowired
    @Qualifier("userService")
    //@Resource（老师推荐）
    public UserService userService;

/*
    @Autowired  // 修饰set普通方法
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Autowired  // 修饰构造方法
    public UserController(UserService userService) {
        this.userService = userService;
    }
*/

    public void say(){
        int save = userService.save();
    }
}
