/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.practice.account;

import demo.practice.account.Account;

/**
 *
 * @author jotaiwan
 */
public class SavingAccount extends Account {
    public SavingAccount(String name, long amount) {
        super(name, amount);
        System.out.println(name + " account is generated with amount: " + amount + "\n");
    }
    
    public SavingAccount(long amount) {
        super("saving", amount);
        System.out.println("Saving account is generated with amount: " + amount + "\n");
    }
    
}
