////////////////////////////////////////////////////////////////////////////////
// TestAccount.java
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
public class TestAccount {
    
    public static void main(String[] args)
    {
        ChequingAccount chequing = new ChequingAccount();
        chequing.deposit(100.0);
        chequing.setFee(2.0);
        
        chequing.withdraw(200);
        
        chequing.deductFee();
        //rounds to 2 decimal places with proper currency
        
        System.out.printf("Chequing: $%.2f", chequing.getBalance());
        System.out.println();
        
        SavingAccount saving = new SavingAccount();
        saving.deposit(100);
        saving.setInterestRate(0.02);
        saving.withdraw(200);
        saving.addInterest();
        System.out.printf("Saving: $%.2f", saving.getBalance());
        System.out.println();
        
    }
    
}
