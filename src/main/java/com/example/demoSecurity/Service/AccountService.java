package com.example.demoSecurity.Service;


import com.example.demoSecurity.Controller.BankController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    //here this states that the to see bal user need only authenticated
    @PreAuthorize("isAuthenticated()")
    public String getBalance(){
        return "Your Account Balance is = 80,000";
    }


    //here it is saying that user authentication aS WELL as authorisation as admin
    @PreAuthorize("hasRole('ADMIN')")
    public String closeAccount(){
        return "Your account has been Closed";
    }
}
