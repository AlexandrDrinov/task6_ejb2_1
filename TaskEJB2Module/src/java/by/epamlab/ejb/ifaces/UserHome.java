package by.epamlab.ejb.ifaces;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface UserHome extends EJBHome{
       public UserRemote create() throws RemoteException, CreateException;  
}
