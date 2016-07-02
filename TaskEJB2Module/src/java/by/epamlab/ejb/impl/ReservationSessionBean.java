package by.epamlab.ejb.impl;


import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.IDataDAO;
import by.epamlab.model.beans.Reservation;
import by.epamlab.model.factories.DataFactory;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class ReservationSessionBean implements SessionBean {

    public Reservation getReservation() throws DAOException, RemoteException {

        IDataDAO data = DataFactory.getClassFromFactory();
        Reservation reservation = data.getReservation();
        return reservation;
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
