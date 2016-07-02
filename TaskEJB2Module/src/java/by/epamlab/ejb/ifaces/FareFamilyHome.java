package by.epamlab.ejb.ifaces;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface FareFamilyHome extends EJBHome{
       public FareFamilyRemote create() throws RemoteException, CreateException;  

}
