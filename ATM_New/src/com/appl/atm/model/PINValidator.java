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
public class PINValidator {
    int oldPIN;
    int newPIN;
    Account myAccount;
    
    public PINValidator(Account acc, int oPIN, int nPIN) {
        oldPIN = oPIN;
        newPIN = nPIN;
        myAccount = acc;
    }
    
    /*This Method Use For Validate if User can change the PIN using new PIN*/
    public boolean changeValidate(){
        if(oldPIN == myAccount.getPin()){
            if(oldPIN != newPIN){
                return true;
            }
        }
        
        return false;
    }
    
}
