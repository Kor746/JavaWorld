////////////////////////////////////////////////////////////////////////////////
// ChequingAccount.java
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
public class ChequingAccount extends BankAccount{
    //declares fee
    private double fee;
    
    public ChequingAccount()
    {
        //initializes fee 
        fee = 1.0;
    }
    
    protected void setFee(double fee)
    {
       //sets fee
       this.fee = fee;
    }
   
    public double getFee()
    {
        //gets fee
        return fee;
    }
    
    //deducts service fee from the current balance
    public void deductFee()
    {
        
        balance -= fee;
    }
    
    @Override
    //this method overrides the withdraw method in the parent class
    public boolean withdraw(double amount)
    {
        
        //allows overdrawn, so chequing can have negative balance
         //if amount is between 0 and balance, subtract amount from balance
        if(amount > 0)
        {
            
            balance -= amount;
            return true;
        }      
        //if amount is less than 0, do nothing
        else if(amount <= 0)
        {
            
            return false;
        }
        else //amount greater than current balance, no withdrawal
        {
            return false;
        }
        
        
    }

    
}
