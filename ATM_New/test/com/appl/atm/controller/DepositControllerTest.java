/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.controller;

import com.appl.atm.model.Deposit;
import com.appl.atm.model.Transaction;
import com.appl.atm.view.Keypad;
import com.appl.atm.view.Screen;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Tio
 */
@RunWith(MockitoJUnitRunner.class)
public class DepositControllerTest {
    
    private final Transaction transaction = Mockito.mock(Deposit.class);
    private final Keypad keypad = Mockito.mock(Keypad.class);
    private final Screen screen = Mockito.mock(Screen.class);
    private final DepositController victim = Mockito.spy( new DepositController(this.transaction, this.keypad, this.screen));
    
    public DepositControllerTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Test
    public void testRunandPrompt ()
    {             
        doReturn(0).when(keypad).getInput();
        victim.run();
        verify(victim).run();          
        
        doReturn(100).when(keypad).getInput();
        victim.run();
        verify(victim, times(2)).run();
    }
}
