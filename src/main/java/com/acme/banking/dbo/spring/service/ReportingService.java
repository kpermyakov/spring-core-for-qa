package com.acme.banking.dbo.spring.service;

import com.acme.banking.dbo.spring.dao.AccountRepository;
import com.acme.banking.dbo.spring.domain.Account;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service //TODO @Component semantics
@Scope("singleton") //TODO Scope semantics
@Lazy(false) //TODO Lazy semantics
@PropertySource("classpath:application.properties") //TODO application.properties semantics
public class ReportingService {
    /** TODO Refer xml config for bean declaration */
    @Autowired private Logger logger;

    /** TODO Field VS constructor VS setter injection*/
    @Value("${marker}") private String layoutMarker; //TODO SpEL
    /** TODO @Autowired VS @Inject VS @Resource */
    @Resource private AccountRepository accounts;

    public void setLayoutMarker(String layoutMarker) {
        this.layoutMarker = layoutMarker;
    }

    @Autowired
    public ReportingService(AccountRepository accounts) {
        this.accounts = accounts;
    }

    @PostConstruct //TODO Lifecycle semantics
    public void onCreate() {
        logger.info("ReportingService created");
    }

    @PreDestroy
    public void onShutDown() {
        logger.info("ReportingService shut down");
    }

    public String accountReport(long id) {
        Account account = accounts.findById(id).orElseThrow(() -> new IllegalStateException("Account not found"));
        return layoutMarker + layoutMarker + " " + account.toString();
    }
}
