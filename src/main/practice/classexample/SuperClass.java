/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.classexample;

/**
*
 * @author jotaiwan
 */
public class SuperClass {
  public int n;

  SuperClass(){
    System.out.println("SuperClass()");
  }

  SuperClass(int n) {
    System.out.println("SuperClass(int n)");
    this.n = n;
  }

  public int getNumber() {
    return n;
  }
}
