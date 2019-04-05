/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author Regawa
 */
public class Customer extends Account {

    private double availableBalance; // funds available for withdrawal
    private double totalBalance; // funds available & pending deposits

    public Customer(int theAccountNumber, int thePIN, double availableBalance, double totalBalance) {
        super(theAccountNumber, thePIN);
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }

    @Override
    public void credit(double amount) {
        totalBalance += amount;
    }

    @Override
    public void debit(double amount) {
        availableBalance -= amount;
        totalBalance -= amount;
    }

    @Override
    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
