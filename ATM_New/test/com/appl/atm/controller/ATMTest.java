/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.controller;

import com.appl.atm.model.BalanceInquiry;
import com.appl.atm.model.BankDatabase;
import com.appl.atm.model.CashDispenser;
import com.appl.atm.model.DepositSlot;
import com.appl.atm.model.Transaction;
import com.appl.atm.view.Keypad;
import com.appl.atm.view.Screen;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.isA;
import org.mockito.Mockito;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Fadly
 */
@RunWith(MockitoJUnitRunner.class)
public class ATMTest {
    private int userAuthenticated;
    private int currentAccountNumber; // current user's account number
    private Screen screen; // ATM's screen
    private Keypad keypad; // ATM's keypad
    private CashDispenser cashDispenser; // ATM's cash dispenser
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase; // account information database
    
    
    
    public ATMTest() {
        userAuthenticated = 0;
	currentAccountNumber = 0;
	screen = new Screen();
	keypad = new Keypad();
	cashDispenser = new CashDispenser();
	depositSlot = new DepositSlot();
	bankDatabase = new BankDatabase();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void runTest(){ //with mock or spy
        ATM atm;
        atm = Mockito.mock(ATM.class);
            atm.run();
            verify(atm,times(1)).run();
    }
    @Test
    public void authenticateUserTest(){ //with mock or spy (private)
        ATM atm = Mockito.mock(ATM.class);
        atm.authenticateUser();
        verify(atm).authenticateUser();
    }
    @Test
    public void performTransactionsTest(){ //with mock or spy (private)
        
    }
    @Test
    public void displayMainMenuTest(){ //JUnit (int) (private)
        ATM atm = Mockito.mock(ATM.class);
        atm.displayMainMenu();
        verify(atm).displayMainMenu();
//        when(atm).displayMainMenu1().thenReturn(isA(int.class));
    }
    @Test
    public void createTransactionTest(){ //JUnit (transaction) (private)
        ATM atm = Mockito.spy(new ATM());
        
        when(atm.createTransaction(1)).thenReturn(new BalanceInquiry(1234, this.bankDatabase));
        atm.createTransaction(1);
        verify(atm,times(1)).createTransaction(1);
    }
}
