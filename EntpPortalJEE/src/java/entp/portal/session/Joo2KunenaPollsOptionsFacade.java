/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2KunenaPollsOptions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2KunenaPollsOptionsFacade extends AbstractFacade<Joo2KunenaPollsOptions> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2KunenaPollsOptionsFacade() {
        super(Joo2KunenaPollsOptions.class);
    }
    
}
