/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.account;

/**
 *
 * @author jotaiwan
 */
public class ChequeAccount extends Account{
    
    public ChequeAccount(String name, long amount) {
        super(name, amount);
    }
    
    public ChequeAccount(long amount) {
        super("Cheque", amount);
    }
    
}
