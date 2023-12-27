package com.example;

import com.example.components.Bank;
import com.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Bank bank = ctx.getBean(Bank.class);
        bank.doTransaction(10000);
        bank.checkBalance();

        Optional num= Stream.of(9, 5, 8, 7, 4, 9, 2, 11, 10, 3)
                .filter(n -> n % 5 == 0)
                .filter(n -> n>10).findFirst();
        System.out.println(num);
    }


}
