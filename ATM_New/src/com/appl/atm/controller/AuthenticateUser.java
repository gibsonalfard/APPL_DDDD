/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.appl.atm.controller;

import com.appl.atm.model.Account;
import com.appl.atm.model.BankDatabase;

/**
 *
 * @author Cahya
 */
public class AuthenticateUser {
    private BankDatabase bankDatabase;
    private int accountNumber;
    private int pin;
    public AuthenticateUser(BankDatabase bankDatabase, int accountNumber, int pin){
        this.bankDatabase = bankDatabase;
        this.accountNumber = accountNumber;
        this.pin = pin;   
    }

    public int validateAccount(){
        Account userAccount = bankDatabase.getAccount(accountNumber);
        
	
	if(userAccount != null)
	{
	    if(userAccount.getPin() == pin)
	    {
		return 1;
	    }
	    else
	    {
		return 2;
	    }
	}
	else
	{
	    return 2;
	}
    }
}
