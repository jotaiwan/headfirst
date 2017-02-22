/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.practice.animal;

/**
 *
 * @author jotaiwan
 */
public abstract class AnimalAbstraction {
    public boolean isPet = true;
    public String owner = "Joseph";
    
    public void sleep() {
        System.out.print("Animal is sleeping!\n");
    }
    
    public void eat() {
        System.out.print("Animal is eatting!\n");
    }
    
    public abstract void move();
}
