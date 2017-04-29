package chapter18;
import java.rmi.*;

/**
 * Created by jotaiwan on 29/04/2017.
 */
public interface ServiceServer extends Remote {

    Object[] getServiceList() throws RemoteException;

    Service getService(Object serviceKey) throws RemoteException;
}