/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author AtikaP
 */
public class BalanceInquiryControllerTest {
    
    BalanceInquiryController balanceInquiryControllerMock;
    
    int expectedRunReturnValue = 0;
    
    public BalanceInquiryControllerTest() {        
        balanceInquiryControllerMock = Mockito.mock(BalanceInquiryController.class);
    }
    
    /**
     * Test of run method, of class BalanceInquiryController.
     */
    @Test
    public void testRun() {
        assertEquals("Run Harus Mengembalikan 0", 
                this.expectedRunReturnValue, this.balanceInquiryControllerMock.run(), 0);
    }
    
}
