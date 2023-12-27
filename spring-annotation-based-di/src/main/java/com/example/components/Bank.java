package com.example.components;

import com.example.repositories.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bank {

    private Account account;

    @Autowired
    public Bank(@Qualifier("savingsAccount") Account account) {
        this.account = account;
    }

    public void doTransaction(double amount){

        account.deposit(amount);
        System.out.println("Transaction completed. Current Balance: " + account.getBalance());

    }

    public void checkBalance(){

        double balance = account.getBalance();
        System.out.println("Current Balance: " + balance);
    }

}
