/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.alarm;

/**
 *
 * @author jotaiwan
 */
public class AlarmDoor implements IDoor {
    public void open() {
        System.out.println("Enter password to open the door!");
        alarmOff();
    }
    public void close() {
        System.out.println("Close the door!");
        alarmOn();
    }
    private void alarmOn() {
        System.out.println("Alarm is on!");
    }
    private void alarmOff() {
        System.out.println("Alarm is off");
    }
}
