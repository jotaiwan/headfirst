package demo.practice.messivealarm;


/**
 * Created by jchen on 19/02/17.
 */
public class MessiveAlarmDoor extends MessiveDoor implements MessiveAlarm {

    private String password;

    public MessiveAlarmDoor(String password) {
        this.password = password;
    }

    public void open()
    {
        if (unlockAlarm(password)) {
            System.out.println("Open door.");
        } else {
            System.out.println("Password is locked, door can not be opened");
        }
    }
    public void close()
    {
        System.out.println("Close Door");
        lockAlarm();
    }

    public boolean unlockAlarm(String password)
    {
        System.out.println("Password enter");
        return password == MessiveAlarm.password;
    }

    public void lockAlarm() {
        System.out.println("Alarm is set");
    }

}