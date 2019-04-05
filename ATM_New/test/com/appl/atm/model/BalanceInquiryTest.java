/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AtikaP
 */
public class BalanceInquiryTest {
    
    public BalanceInquiryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of execute method, of class BalanceInquiry.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        BalanceInquiry instance = null;
        int expResult = 0;
        int result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailableBalance method, of class BalanceInquiry.
     */
    @Test
    public void testGetAvailableBalance() {
        System.out.println("getAvailableBalance");
        BalanceInquiry instance = null;
        double expResult = 0.0;
        double result = instance.getAvailableBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBalance method, of class BalanceInquiry.
     */
    @Test
    public void testGetTotalBalance() {
        System.out.println("getTotalBalance");
        BalanceInquiry instance = null;
        double expResult = 0.0;
        double result = instance.getTotalBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
