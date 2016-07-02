package by.epamlab.ejb.impl;

import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.ResComponent;
import by.epamlab.model.factories.DataFactory;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class ResComponentSessionBean implements SessionBean {

    public List<ResComponent> getResComponents() throws DAOException, RemoteException {

        IDataDAO data = DataFactory.getClassFromFactory();
        List<ResComponent> resComponents = data.getResComponents();
        return resComponents;
    }        

    public List<ResComponent> getResComponents(String resCode) throws DAOException, RemoteException {
        return getDataOfComponents(resCode, null);
    }

    public List<ResComponent> getResComponents(String resCode, String resComponentTypeCode) throws DAOException, RemoteException {
        return getDataOfComponents(resCode, resComponentTypeCode);
    }

    private List<ResComponent> getDataOfComponents(String resCode, String resComponentTypeCode) throws DAOException, RemoteException {

        IDataDAO data = DataFactory.getClassFromFactory();
        List<ResComponent> resComponents = data.getResComponents(resCode, resComponentTypeCode);
        return resComponents;

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
