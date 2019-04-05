/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Tio
 */
@RunWith(MockitoJUnitRunner.class)
public class DepositSlotTest {
    
    private final DepositSlot victim = Mockito.spy( new DepositSlot());
    
    public DepositSlotTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Test
    public void testIsEnvelopeReceived ()
    {
        assertEquals("isEnvelopeReceived should return true.\n", true, victim.isEnvelopeReceived());
    }
}
