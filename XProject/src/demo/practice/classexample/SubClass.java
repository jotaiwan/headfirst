/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.practice.classexample;

/**
 *
 * @author jotaiwan
 */
public class SubClass extends SuperClass {

  public SubClass(){
    super(300);
    System.out.println("SuperClass");
  }  
  
  public SubClass(int n){
    System.out.println("SubClass(int n):"+n);
    this.n = n;
    }
  
}