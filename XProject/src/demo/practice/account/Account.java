/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.practice.account;

/**
 *
 * @author jotaiwan
 */
public class Account {
    public String owner;
    public String type;
    public long balance;
    
    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }
    
    public void deposit(long amount) {
        this.balance += amount;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public String getType() {
        return type;
    }
    
    public long getBalance() {
        return balance;
    }
}
