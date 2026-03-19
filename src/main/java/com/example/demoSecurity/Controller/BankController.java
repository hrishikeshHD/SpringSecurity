package com.example.demoSecurity.Controller;


import com.example.demoSecurity.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankController  {

    @Autowired
    private AccountService accountService;

    //setting role based autherization
    //to implement this will enforce the authorisation in the service class


    @GetMapping("/balance")
    public String getBalance(){
        return accountService.getBalance();
    }

    @PostMapping("/close")
    public String closeAccount(){
        return accountService.closeAccount();
    }

    @GetMapping("/aboutUs")
    public String aboutUs(){
        return "You can Contact us On 1122334455";
    }
}
