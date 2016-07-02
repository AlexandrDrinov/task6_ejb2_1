package by.epamlab.ejb.ifaces;

import by.epamlab.exception.DAOException;
import by.epamlab.model.beans.Reservation;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface ReservationRemote extends EJBObject{
        public Reservation getReservation() throws DAOException, RemoteException;  
}
