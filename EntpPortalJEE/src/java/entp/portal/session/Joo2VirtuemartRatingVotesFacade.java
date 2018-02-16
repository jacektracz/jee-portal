/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entp.portal.session;

import entp.portal.Joo2VirtuemartRatingVotes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jacek
 */
@Stateless
public class Joo2VirtuemartRatingVotesFacade extends AbstractFacade<Joo2VirtuemartRatingVotes> {
    @PersistenceContext(unitName = "EntpPortalJEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2VirtuemartRatingVotesFacade() {
        super(Joo2VirtuemartRatingVotes.class);
    }
    
}
