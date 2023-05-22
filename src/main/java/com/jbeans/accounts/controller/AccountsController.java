package com.jbeans.accounts.controller;

import com.jbeans.accounts.model.Accounts;
import com.jbeans.accounts.model.Customer;
import com.jbeans.accounts.repository.AccRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @Autowired
    private AccRepo accRepo;

    @PostMapping("/myAcc")
    public Accounts getAccountDetails(@RequestBody Customer customer){
        Accounts accounts=accRepo.findByCustomerId(customer.getCustomerId());
        if(accounts!=null) {
            return accounts;
        }
        else {
            return null;
        }
    }

}
