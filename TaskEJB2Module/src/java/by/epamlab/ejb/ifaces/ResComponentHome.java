package by.epamlab.ejb.ifaces;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface ResComponentHome extends EJBHome {

    public ResComponentRemote create() throws RemoteException, CreateException;

}
