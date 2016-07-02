package by.epamlab.ejb.impl;

import by.epamlab.exception.DAOException;
import by.epamlab.ifaces.IUserDAO;
import by.epamlab.model.beans.User;
import by.epamlab.model.factories.UserFactory;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class UserSessionBean implements SessionBean {

    public User getUser(String login, String password) throws DAOException, RemoteException {
        IUserDAO userDAO = UserFactory.getClassFromFactory();
        User user = userDAO.getUser(login, password);
        return user;
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
