package by.epamlab.ejb.ifaces;

import by.epamlab.exception.DAOException;
import by.epamlab.model.beans.Customer;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface CustomerRemote extends EJBObject{
        public Customer getCustomer() throws DAOException, RemoteException;  
}
