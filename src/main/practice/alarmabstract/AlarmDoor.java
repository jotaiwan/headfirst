/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.alarmabstract;

/**
 *
 * @author jotaiwan
 */
public class AlarmDoor extends Door implements IAlarm {
    // extend to door 
    public void open() { 
        System.out.println("Open the door");
    }
    // extend to door
    public void close() { 
        System.out.println("Close the door");
    }
    // implement interface
    public void alarm() {
        System.out.println("Alarm");
    }
}
