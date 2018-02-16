/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2VirtuemartCalcShoppergroups;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2VirtuemartCalcShoppergroupsFacade extends AbstractFacade<Joo2VirtuemartCalcShoppergroups> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2VirtuemartCalcShoppergroupsFacade() {
        super(Joo2VirtuemartCalcShoppergroups.class);
    }
    
}
