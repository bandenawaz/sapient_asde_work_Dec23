package org.example;

import org.example.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Lets define the IOC Configuration
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("classpath:applicatonConfig.xml") ;
        Student std = (Student) ctx.getBean("student");

        System.out.println(std);
        System.out.println(std.getAddress().toString());
        System.out.println(std.getMobileNos());
        System.out.println(std.getAddress().getLandmark());
    }
}