/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author AtikaP
 */
public class BalanceInquiryTest {
    
    BankDatabase bankDatabaseMock;
    BalanceInquiry balanceInquiryMock;
    Account accountMock;
    
    int accountNumber = 1234;
    int expectedExecuteReturnValue = 0;
    double expectedAvailableBalance = 1000.0;
    double expectedTotalBalance = 1200.0;
    
    public BalanceInquiryTest() {
        bankDatabaseMock = Mockito.mock(BankDatabase.class);
        balanceInquiryMock = new BalanceInquiry(accountNumber, bankDatabaseMock);
        accountMock = Mockito.mock(Account.class);
    }

    /**
     * Test of execute method, of class BalanceInquiry.
     */
    @Test
    public void testExecute() {
            assertEquals("Execute Harus Mengembalikan 0", 
                    expectedExecuteReturnValue, balanceInquiryMock.execute(),0);
            
    }

    /**
     * Test of getAvailableBalance method, of class BalanceInquiry.
     */
    @Test
    public void testGetAvailableBalance() {
        //Stubbing
        when(accountMock.getAccountNumber()).thenReturn(1234);
        when(accountMock.getAvailableBalance()).thenReturn(1000.0);
        when(bankDatabaseMock.getAccount(accountMock.getAccountNumber())).
                thenReturn(accountMock);

        //Assert
          assertEquals("Available Balance yang Diambil Tidak Sesuai" ,
                  this.expectedAvailableBalance, balanceInquiryMock.getAvailableBalance(),0);
    }

    /**
     * Test of getTotalBalance method, of class BalanceInquiry.
     */
    @Test
    public void testGetTotalBalance() {
        //Stubbing
        when(accountMock.getAccountNumber()).thenReturn(1234);
        when(accountMock.getTotalBalance()).thenReturn(1200.0);
        when(bankDatabaseMock.getAccount(accountMock.getAccountNumber())).
                thenReturn(accountMock);
        
        //Assert
        assertEquals("Total Balance yang Diambil Tidak Sesuai", 
                    expectedTotalBalance, balanceInquiryMock.getTotalBalance(),0);
    }
    
}
