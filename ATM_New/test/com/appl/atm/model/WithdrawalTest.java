/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.isA;
import org.mockito.Mockito;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


/**
 *
 * @author Gibran
 */
@RunWith(MockitoJUnitRunner.class)
public class WithdrawalTest {
    BankDatabase bankDatabase;
    Withdrawal withdrawal;
    CashDispenser cashDispenser;
    
    int accountNumber = 1234;
    int accountPasswd = 4321;
    int expectedSetAmount = 1400;
    int amountSet = 200;
    double expectedBalance = 1200;
    double debitAmount = 20;
    
    public WithdrawalTest() {
        bankDatabase = new BankDatabase();
        cashDispenser = new CashDispenser();
        withdrawal = new Withdrawal(accountNumber, bankDatabase, cashDispenser);
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void withdrawalChecker() {
         //Message adalah pesan yang akan dikeluarkan ketika assert mengembalikan nilai false
         assertEquals("Balance Salah",expectedBalance, 
                 bankDatabase.getAccount(accountNumber).getTotalBalance(),0);
         //Dikurangi Dengan Debit Tertentu
         bankDatabase.getAccount(accountNumber).debit(debitAmount);
         
         assertEquals("Balance Salah Setelah Debit",(expectedBalance-debitAmount),
                 bankDatabase.getAccount(accountNumber).getTotalBalance(),0);
     }
     
     @Test
     public void withdrawalTillMinus() {
         double currentBalance = this.expectedBalance;
         
         while(currentBalance > 0){
             bankDatabase.getAccount(accountNumber).debit(debitAmount);
             currentBalance -= debitAmount;
         }
         
         assertEquals("Balance Tidak Boleh Minus",0,
                 bankDatabase.getAccount(accountNumber).getTotalBalance(),0);
     }     
     @Test
     public void testSetAmount(){
         int amount = this.amountSet;
//     Withdrawal withdrawal = EasyMock.createMock(Withdrawal.class);
//     assert Withdrawal
//          withdrawal.setAmount(amount);
//          assertEquals(amount, withdrawal.getAmount());
        Withdrawal myList;//= Mockito.mock(Withdrawal.class);
        myList = Mockito.spy(new Withdrawal(this.accountNumber, this.bankDatabase, this.cashDispenser));
        doNothing().when(myList).setAmount(isA(Integer.class));
        myList.setAmount(amount);
        verify(myList).setAmount(amount);
     }
     @Test
     public void testSetCashDispenser(){
        Withdrawal myList= Mockito.mock(Withdrawal.class);
//        myList = Mockito.spy(new Withdrawal(this.accountNumber, this.bankDatabase, this.cashDispenser));
        doNothing().when(myList).setCashDispenser(isA(CashDispenser.class));
        myList.setCashDispenser(this.cashDispenser);
        verify(myList).setCashDispenser(this.cashDispenser);
     }
}
