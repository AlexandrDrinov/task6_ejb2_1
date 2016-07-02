package by.epamlab.ejb.impl;

import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.FareFamily;
import by.epamlab.model.factories.DataFactory;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class FareFamilySessionBean implements SessionBean {

    public FareFamily getFareFamily() throws DAOException, RemoteException {

        IDataDAO data = DataFactory.getClassFromFactory();
        FareFamily fareFamily = data.getFareFamily();
        return fareFamily;
    }

    public void ejbCreate() {
    }

    public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
    }

    public void ejbRemove() throws EJBException, RemoteException {
    }

    public void ejbActivate() throws EJBException, RemoteException {
    }

    public void ejbPassivate() throws EJBException, RemoteException {
    }
}
