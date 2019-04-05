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



@RunWith(MockitoJUnitRunner.class)
public class BankDatabaseTest {
    int accountNumber = 1234;
    int accountPasswd = 4321;
        
    BankDatabase bankDatabase;
    public BankDatabaseTest() {
        System.out.println("Test Started");
        
        bankDatabase = new BankDatabase();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void accountCheck() {
         
         //Message adalah pesan yang akan dikeluarkan ketika assert mengembalikan nilai false
         assertEquals("Akun Salah",1,bankDatabase.authenticateUser(accountNumber, accountPasswd));
         
         this.accountNumber = 4321;
         this.accountPasswd = 5678;
         
         assertNotEquals("Akun Terbaca",1,bankDatabase.authenticateUser(accountNumber, accountPasswd));
         
         this.accountNumber = 8765;
         assertEquals("Akun tidak terbaca", 1, bankDatabase.authenticateUser(accountNumber, accountPasswd));
     }

    /**
     * Test of getAccount method, of class BankDatabase.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        int accountNumber = 0;
        BankDatabase instance = new BankDatabase();
        Account expResult = null;
        Account result = instance.getAccount(accountNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticateUser method, of class BankDatabase.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        int userAccountNumber = 0;
        int userPIN = 0;
        BankDatabase instance = new BankDatabase();
        int expResult = 0;
        int result = instance.authenticateUser(userAccountNumber, userPIN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
