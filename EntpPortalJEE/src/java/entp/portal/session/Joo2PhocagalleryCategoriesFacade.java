/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2PhocagalleryCategories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2PhocagalleryCategoriesFacade extends AbstractFacade<Joo2PhocagalleryCategories> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2PhocagalleryCategoriesFacade() {
        super(Joo2PhocagalleryCategories.class);
    }
    
}
