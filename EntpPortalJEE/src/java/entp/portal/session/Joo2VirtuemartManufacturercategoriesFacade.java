/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2VirtuemartManufacturercategories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2VirtuemartManufacturercategoriesFacade extends AbstractFacade<Joo2VirtuemartManufacturercategories> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2VirtuemartManufacturercategoriesFacade() {
        super(Joo2VirtuemartManufacturercategories.class);
    }
    
}
