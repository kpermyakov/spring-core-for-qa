package com.acme.banking.dbo.ooad;

import com.acme.banking.dbo.ooad.dal.StubAccountRepository;
import com.acme.banking.dbo.ooad.service.ReportingService;

public class ApplicationTest {
    public static void main(String[] args) {
        //Building
        ReportingService reportingService = new ReportingService(
                new StubAccountRepository(1.0)
        );

        System.out.println(reportingService.reportForAccount(1L));
    }
}
