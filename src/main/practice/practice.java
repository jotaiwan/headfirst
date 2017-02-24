/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import practice.alarmabstract.AlarmDoor;
import practice.animal.Cat;
import practice.animal.Dog;
import practice.animal.NewBorn;
import practice.annotation.ParseAnnotation;
import practice.bankaccount.SavingAccount;
import practice.classexample.SubClass;
import practice.messivealarm.MessiveAlarmDoor;
import practice.polymorphism.Circle;
import practice.polymorphism.Cube;
import practice.polymorphism.IShape;


/**
 *
 * @author jotaiwan
 */
public class practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        playBankAccount();
//        playInterface();
//        playAbstract();
//        playAlarmInterfaceAndAbstract();
//        classRelation();
//        playPolymorphism();
//
//        try {
//            playAnnotation();
//        } catch (ClassNotFoundException e) {
//        }

        playAutoBoxing();
        playMessiveAlarm(); // interface, abstract class combination.
    }

    private static void classRelation() {
        SubClass sc = new SubClass();
        System.out.println("show i: " + sc.getNumber());
        SubClass sc2 = new SubClass(333);
        System.out.println("show i: " + sc2.getNumber());
    }


    private static void playBankAccount() {
        SavingAccount saving = new SavingAccount(200l);
        System.out.println("Account name is " + saving.getOwner()
                + " and the balance is " + saving.getBalance());

        saving.deposit(700l);
        System.out.println("Balace after deposit 700: " + saving.getBalance());

        SavingAccount dynamicAccount = new SavingAccount("Joseph", 300l);
        System.out.println("Account name is " + dynamicAccount.getOwner()
                + " and the balance is " + dynamicAccount.getBalance());

        SavingAccount cheque = new SavingAccount(500l);
        System.out.println("Account name is " + cheque.getOwner()
                + " and the balance is " + cheque.getBalance());
    }

    private static void playInterface() {
        NewBorn oTemp = new NewBorn();
        System.out.println(oTemp.Name);	//Human
        System.out.println(oTemp.Age);	//1
        System.out.println(oTemp.Cry());	//true
        System.out.println(oTemp.Talk());	//BraBra...
        // because NewBorn doesn't have restriction, it can overwrite data member
        oTemp.Age = 2;
        oTemp.Name = "John";
        System.out.println(oTemp.Name);	//John
        System.out.println(oTemp.Age);	//2
    }

    private static void playAbstract() {
        // abstract
        Cat c = new Cat();
        c.barking();
        c.sleep();
        c.move();

        Dog d = new Dog();
        d.barking();
        d.eat();
        d.move();

        // interface
//        Door door = new AlarmDoor();
//        door.open();
    }

    private static void playAlarmInterfaceAndAbstract(){
        // alarm advance
        AlarmDoor alarmDoor = new AlarmDoor();
        alarmDoor.open();
        alarmDoor.close();
//        alarmDoor.alarm();
    }

    private static void playPolymorphism() {
        IShape[] s = { new Cube(), new Circle() };
        for (int i = 0; i < s.length; i++) {
            System.out.println("The area and volume of " + s[i].getClass()
                    + " is " + s[i].area() + " , " + s[i].volume());
        }
    }

    private static void playMessiveAlarm() {
        MessiveAlarmDoor alarmDoor = new MessiveAlarmDoor("1234");
        alarmDoor.open();
        alarmDoor.close();

        MessiveAlarmDoor alarmDoorPass = new MessiveAlarmDoor("2345");
        alarmDoorPass.open();
    }

    private static void playAnnotation() throws ClassNotFoundException {

        ParseAnnotation parseAnnotation = new ParseAnnotation();
        parseAnnotation.parseTypeAnnotation();
        System.out.println("...............");
        parseAnnotation.parseMethodAnnotation();
        System.out.println("...............");
        parseAnnotation.parseConstructAnnotation();

    }

    private static void playAutoBoxing() {
        int test1 = 21;
        int test2 = 24;

        Integer wrapTest1 = new Integer(test1);
        Integer wrapTest2 = new Integer(test2);

        System.out.println(test1 / 3);
        printAutoBoxing(wrapTest1, wrapTest2);

        // autoboxing
        Integer test3 = test1;
        Integer test4 = test2;
        System.out.println(test3 / 3);
        printAutoBoxing(test3, test4);

    }

    private static void printAutoBoxing(Integer int1, Integer int2) {
        System.out.println(int1.doubleValue() / 3);
        System.out.println(int1.compareTo(int2));
    }

}
