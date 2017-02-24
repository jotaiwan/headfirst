package practice.messivealarm;

/**
 * Created by jchen on 19/02/17.
 */
public interface MessiveAlarm {

    public static String password = "1234";
    public void lockAlarm();
    public boolean unlockAlarm(String password);
}
