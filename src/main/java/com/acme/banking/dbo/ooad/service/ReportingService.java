package com.acme.banking.dbo.ooad.service;

import com.acme.banking.dbo.ooad.dal.AccountRepository;
import com.acme.banking.dbo.ooad.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.security.RolesAllowed;

//1. Lifecycle
//1.1 Scope: singleton VS prototype
//1.2 Init: eager VS lazy
//2. DI: where? + id

//3. Aspects:
//Custom advice

//3.1 Authent + Authori
//3.2 Tx
//3.3 Retry
//....

//4. Boot Modules

public class ReportingService {
    //Creator [GRASP]
    //Factory Method [GoF]
    //Abstract Factory [GoF]
    //Registry [PoEAA]
    //Field DI
    private AccountRepository accounts;

    //Constructor DI
    public ReportingService(AccountRepository accounts) {
        this.accounts = accounts;
    }

    //Setter DI
    public void setAccounts(AccountRepository accounts) {
        this.accounts = accounts;
    }

    /*
    @Authenticated @RolesAllowed("admin")
    @Transactional
    @Retry
    */
    public String reportForAccount(long id) {
        Account account = accounts.findById(id);
        return "## " + account.getId() + " : " + account.getAmount();
    }
}
