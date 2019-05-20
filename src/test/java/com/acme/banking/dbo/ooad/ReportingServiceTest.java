package com.acme.banking.dbo.ooad;

import com.acme.banking.dbo.ooad.dal.AccountRepository;
import com.acme.banking.dbo.ooad.domain.Account;
import com.acme.banking.dbo.ooad.service.ReportingService;
import org.junit.Test;

import javax.persistence.EntityNotFoundException;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReportingServiceTest {
    @Test(expected = EntityNotFoundException.class)
    public void shouldGetExceptionWhenNoAccountFound() {
        AccountRepository stubAccountRepository = mock(AccountRepository.class);
        when(stubAccountRepository.findById(anyLong()))
                .thenThrow(new EntityNotFoundException());

        ReportingService sut = new ReportingService(stubAccountRepository);
        sut.reportForAccount(0L);
    }

    @Test
    public void shouldGetReportForAccountWhenAccountExists() {
        //region Given
        Account stubAccount = mock(Account.class);
        when(stubAccount.getAmount()).thenReturn(100.0);
        when(stubAccount.getId()).thenReturn(0L);
        AccountRepository stubRepo = mock(AccountRepository.class);
        when(stubRepo.findById(0L)).thenReturn(stubAccount);
        ReportingService sut = new ReportingService(stubRepo);
        //endregion

        //region When
        String actualReport = sut.reportForAccount(0L);
        //endregion

        //region Then
        assertThat(actualReport)
                .contains("## " + String.valueOf(0L))
                .contains("100.0");
        //endregion
    }
}
