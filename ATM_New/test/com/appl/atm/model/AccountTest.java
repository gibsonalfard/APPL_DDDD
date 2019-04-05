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

/**
 *
 * @author ACER
 */
public class AccountTest {
    
    public AccountTest() {
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

    /**
     * Test of credit method, of class Account.
     */
    @Test
    public void testCredit() {
        System.out.println("credit");
        double amount = 0.0;
        Account instance = null;
        instance.credit(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of debit method, of class Account.
     */
    @Test
    public void testDebit() {
        System.out.println("debit");
        double amount = 0.0;
        Account instance = null;
        instance.debit(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountNumber method, of class Account.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        Account instance = null;
        int expResult = 0;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountNumber method, of class Account.
     */
    @Test
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        int accountNumber = 0;
        Account instance = null;
        instance.setAccountNumber(accountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPin method, of class Account.
     */
    @Test
    public void testGetPin() {
        System.out.println("getPin");
        Account instance = null;
        int expResult = 0;
        int result = instance.getPin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPin method, of class Account.
     */
    @Test
    public void testSetPin() {
        System.out.println("setPin");
        int pin = 0;
        Account instance = null;
        instance.setPin(pin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailableBalance method, of class Account.
     */
    @Test
    public void testGetAvailableBalance() {
        System.out.println("getAvailableBalance");
        Account instance = null;
        double expResult = 0.0;
        double result = instance.getAvailableBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailableBalance method, of class Account.
     */
    @Test
    public void testSetAvailableBalance() {
        System.out.println("setAvailableBalance");
        double availableBalance = 0.0;
        Account instance = null;
        instance.setAvailableBalance(availableBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBalance method, of class Account.
     */
    @Test
    public void testGetTotalBalance() {
        System.out.println("getTotalBalance");
        Account instance = null;
        double expResult = 0.0;
        double result = instance.getTotalBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalBalance method, of class Account.
     */
    @Test
    public void testSetTotalBalance() {
        System.out.println("setTotalBalance");
        double totalBalance = 0.0;
        Account instance = null;
        instance.setTotalBalance(totalBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
