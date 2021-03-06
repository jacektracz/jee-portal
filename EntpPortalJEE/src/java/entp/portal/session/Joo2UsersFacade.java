/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2UsersFacade extends AbstractFacade<Joo2Users> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2UsersFacade() {
        super(Joo2Users.class);
    }
    
}
