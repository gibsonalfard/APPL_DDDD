/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author Gibran
 */
public class AccountAuthenticator {
    Account myAccount;
    int myPIN;
    
    public AccountAuthenticator(Account acc, int thePIN) {
        myAccount = acc;
        myPIN = thePIN;
    }
    
    public boolean authenticateAccount(){
        return myAccount.getPin() == myPIN;
    }
}
