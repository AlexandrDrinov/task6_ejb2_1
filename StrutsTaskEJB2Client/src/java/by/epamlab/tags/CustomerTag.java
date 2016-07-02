package by.epamlab.tags;

import by.epamlab.ejb.ifaces.CustomerHome;
import by.epamlab.ejb.ifaces.CustomerRemote;
import by.epamlab.exception.DAOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.CreateException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class CustomerTag extends AbstractTag {

    @Override
    public void doTag() {
        
        try {  
            InitialContext ctx = initContext(); 
            Object ref = ctx.lookup("CustomerSessionBean");
            CustomerHome customerHome =  (CustomerHome) PortableRemoteObject.narrow(ref, CustomerHome.class);
            CustomerRemote customerRemote = customerHome.create();            
            getJspContext().setAttribute("customer", customerRemote.getCustomer());
        } catch (NamingException | DAOException | RemoteException | CreateException ex) {
            getJspContext().setAttribute("customer", null);
        }
        
    }
}
