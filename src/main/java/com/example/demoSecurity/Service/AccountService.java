package com.example.demoSecurity.Service;


import com.example.demoSecurity.Controller.BankController;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public String getBalance(){
        return "Your Account Balance is = 80,000";
    }

    public String closeAccount(){
        return "Your account has been Closed";
    }
}
