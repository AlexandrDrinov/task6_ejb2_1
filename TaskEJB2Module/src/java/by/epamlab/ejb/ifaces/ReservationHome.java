package by.epamlab.ejb.ifaces;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface ReservationHome extends EJBHome{
       public ReservationRemote create() throws RemoteException, CreateException;  
}
