package by.epamlab.ejb.ifaces;

import by.epamlab.exception.DAOException;
import by.epamlab.model.beans.ResComponent;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.EJBObject;

public interface ResComponentRemote extends EJBObject{
        public List<ResComponent> getResComponents() throws DAOException, RemoteException;  
        
        public List<ResComponent> getResComponents(String resCode) throws DAOException, RemoteException;  
        
        public List<ResComponent> getResComponents(String resCode, String resComponentTypeCode) throws DAOException, RemoteException;  
}
