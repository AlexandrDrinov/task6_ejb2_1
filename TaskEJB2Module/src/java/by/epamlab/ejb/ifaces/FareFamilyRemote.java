package by.epamlab.ejb.ifaces;

import by.epamlab.exception.DAOException;
import by.epamlab.model.beans.FareFamily;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface FareFamilyRemote extends EJBObject{
        public FareFamily getFareFamily() throws DAOException, RemoteException;  
}
