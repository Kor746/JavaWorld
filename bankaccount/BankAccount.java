////////////////////////////////////////////////////////////////////////////////
// BankAccount.java
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
public class BankAccount {

    
     
    protected double balance;
    
    //This is the constructor for BankAccount
    
    //must be protected in order to access 
    protected BankAccount()
    {
        //initializes balance 
        balance = 0.0;
    }
    protected void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public boolean deposit(double amount)
    {
        //if amount is positive
        if(amount > 0)
        {
            //adds amount to balance
            balance += amount;
            return true;
        }
        //if amount is negative
        else {
            //no deposit
            return false;
        }
    }
    
    public boolean withdraw(double amount)
    {
        //if amount is between 0 and balance, subtract amount from balance
        if(amount > 0 && amount <= balance)
        {
            
            balance -= amount;
            return true;
        }      
        //if amount is less than 0, do nothing
        
        else //amount greater than current balance, no withdrawal
        {
            return false;
        }
        /*if amount < 0 || amount > b
        { do nothing; 
        }
        else return false;
        */
        
    }
}
