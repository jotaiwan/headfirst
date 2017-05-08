package chapter18;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by jotaiwan on 30/04/2017.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public String sayHello() {
        return "Server says, 'Hey'";
    }


    public MyRemoteImpl() throws RemoteException { }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote Hello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
