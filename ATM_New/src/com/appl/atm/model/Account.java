/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author Annazar
 */
public abstract class Account {

    private int accountNumber; // account number
    private int pin; // PIN for authentication

    // Account constructor initializes attributes
    public Account(int theAccountNumber, int thePIN) {
        accountNumber = theAccountNumber;
        pin = thePIN;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    public abstract void credit(double amount);

    public abstract void debit(double amount);

    public abstract double getAvailableBalance();

    /**
     * @return the totalBalance
     */
    public abstract double getTotalBalance();

    /**
     * @return the availableBalance
     */
}
