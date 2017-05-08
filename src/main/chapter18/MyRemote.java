package chapter18;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by jotaiwan on 30/04/2017.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
