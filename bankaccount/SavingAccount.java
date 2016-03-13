////////////////////////////////////////////////////////////////////////////////
// SavingAccount.java
// ================
// Base class of Banking System
// 
// AUTHOR:  Daniel Lee
// CREATED: 2016-01-18
// UPDATED: 2016-01-20
////////////////////////////////////////////////////////////////////////////////
package com.dan.bankaccount;

/**
 *
 * @author Daniel
 */
public class SavingAccount extends BankAccount
{
    //declares interest rate
    private double interestRate;
    
    public SavingAccount()
    {
        //initializes interest rate
        interestRate = 0.01;
    }
    
    protected void setInterestRate(double interestRate)
    {
        //sets interest rate
        this.interestRate = interestRate;
    }
    
    public double getInterestRate()
    {
        //gets interestrate
        return interestRate;
    }
    
    public double addInterest()
    {
        //Gets interest of balance then adds interest to balance
        double interest = balance * interestRate;
        balance += interest;
        return balance;
        
    }
    
    
}
