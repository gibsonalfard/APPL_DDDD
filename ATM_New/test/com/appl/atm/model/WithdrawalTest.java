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
 * @author ahmadajinaufalali
 */
public class WithdrawalTest {
    
    public WithdrawalTest() {
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
     * Test of execute method, of class Withdrawal.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        
        Withdrawal instance = null;
        int expResult = 0;
        int result = instance.execute();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAmount method, of class Withdrawal.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Withdrawal instance = null;
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAmount method, of class Withdrawal.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 0;
        Withdrawal instance = null;
        instance.setAmount(amount);
    }

    /**
     * Test of getCashDispenser method, of class Withdrawal.
     */
    @Test
    public void testGetCashDispenser() {
        System.out.println("getCashDispenser");
        Withdrawal instance = null;
        CashDispenser expResult = null;
        CashDispenser result = instance.getCashDispenser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCashDispenser method, of class Withdrawal.
     */
    @Test
    public void testSetCashDispenser() {
        System.out.println("setCashDispenser");
        CashDispenser cashDispenser = null;
        Withdrawal instance = null;
        instance.setCashDispenser(cashDispenser);
    }
    
}
