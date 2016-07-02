package by.epamlab.tags;

import by.epamlab.ejb.ifaces.CustomerHome;
import by.epamlab.ejb.ifaces.CustomerRemote;
import by.epamlab.ejb.ifaces.ReservationHome;
import by.epamlab.ejb.ifaces.ReservationRemote;
import by.epamlab.exception.DAOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.CreateException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class ReservationTag extends AbstractTag {

    @Override
    public void doTag() {

        try {
            InitialContext ctx = initContext();  
            Object ref = ctx.lookup("ReservationSessionBean");
            ReservationHome reservationHome =  (ReservationHome) PortableRemoteObject.narrow(ref, ReservationHome.class);
            ReservationRemote reservationRemote = reservationHome.create();                      
            getJspContext().setAttribute("reservation", reservationRemote.getReservation());
        } catch (NamingException | DAOException | RemoteException | CreateException ex) {            
            getJspContext().setAttribute("reservation", null);
        }
    }
}
