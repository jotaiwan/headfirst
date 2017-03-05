/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.animal;

/**
 *
 * @author jotaiwan
 */
public class Cat extends AnimalAbstraction {
    public void barking() {
        System.out.println("Cat is barking: Meow!\n");
    }
    
    public void move() {
        System.out.println("Cat is moving: Prancing!\n");
    }
}
