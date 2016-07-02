package by.epamlab.tags;

import by.epamlab.ejb.ifaces.FareFamilyHome;
import by.epamlab.ejb.ifaces.FareFamilyRemote;
import by.epamlab.exception.DAOException;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class FareFamilyTag extends AbstractTag {

    @Override
    public void doTag() {

        try {
            InitialContext ctx = initContext();  
            Object ref = ctx.lookup("FareFamilySessionBean");
            FareFamilyHome fareFamilyHome =  (FareFamilyHome) PortableRemoteObject.narrow(ref, FareFamilyHome.class);
            FareFamilyRemote fareFamilyRemote = fareFamilyHome.create(); 
            getJspContext().setAttribute("fareFamily", fareFamilyRemote.getFareFamily());
        } catch (NamingException | DAOException | RemoteException | CreateException ex) {
            getJspContext().setAttribute("fareFamily", null);
        }

    }
}
