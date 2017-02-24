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
public class NewBorn implements IBaby {
    //新生兒類別 NewBorn.java 實作 IBaby

    public int Age = 1;	//出生就算1歲，將0歲洗掉
    public String Name = "Human";	//將預設值"Animal"洗掉

    public boolean Cry()
    {
        return true;	//新生兒都會哭
    }

    public String Talk()
    {
        return "BraBra...";	//新生兒講話不清楚
    }
    
    public String eat() {
        return "drinking milk";
    }
    
    public String sleep() {
        return "sleep with bed-time story";
    }
}
