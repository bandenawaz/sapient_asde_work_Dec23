package com.example;

import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AspectConfig.class);
        ctx.register(AspectConfig.class);
        //ctx.refresh();

        UserService userService = ctx.getBean(UserService.class);
        userService.multiply(2,3);


        userService.divide(5,0);
        

    }
}
