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
public class Dog extends AnimalAbstraction {
    public void barking() {
        System.out.println("Dog is barking: Woof!");
    }
    
    public void move() {
        System.out.println("Dog is moving: Run!");
    }
}
