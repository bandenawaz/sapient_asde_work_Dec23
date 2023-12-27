package com.example.config;

import com.example.repositories.Account;
import com.example.repositories.CheckingAccount;
import com.example.repositories.SavingsAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.*")
public class AppConfig {
    @Bean
    public Account savingsAccount(){

        return new SavingsAccount();
    }

    @Bean
    public Account checkingAccount(){

         return  new CheckingAccount();
    }
}
