/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.isA;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Tio
 */
@RunWith(MockitoJUnitRunner.class)
public class DepositTest {
    
    private final int accountNumber = 1234;
    private final BankDatabase bankDatabase = Mockito.spy( new BankDatabase());
    private final DepositSlot depositSlot = Mockito.spy( new DepositSlot());
    private final double amount = 135;
    private final Account account = Mockito.mock(Account.class);
    private final Deposit victim = Mockito.spy( new Deposit(this.accountNumber, this.bankDatabase, this.depositSlot));
    
    public DepositTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Test
    public void testExecute ()
    { 
        doReturn(this.account).when(this.bankDatabase).getAccount(isA(int.class));
        assertEquals("Execute should return 1 when envelope IS received.\n", 1, this.victim.execute());
        doReturn(false).when(this.depositSlot).isEnvelopeReceived();
        assertEquals("Execute should return 2 when envelope IS NOT received.\n", 2, this.victim.execute());
    }
    
    @Test
    public void testGetSetAmount ()
    {
        // test setAmount
        victim.setAmount(this.amount);
        verify(victim).setAmount(this.amount);
        
        // test getAmount
        assertEquals("Check victim amount.\n", victim.getAmount(), this.amount, 0);
    }     
    
    @Test
    public void testGetSetDepositSlot ()
    {
        // test setDepositSlot
        victim.setDepositSlot(this.depositSlot);
        verify(victim).setDepositSlot(this.depositSlot);
        
        // test getDepositSlot
        assertEquals("Check victim deposit slot.\n", victim.getDepositSlot(), this.depositSlot);
    }
}
