/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2Region;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2RegionFacade extends AbstractFacade<Joo2Region> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2RegionFacade() {
        super(Joo2Region.class);
    }
    
}
