package com.adaming.tplocation.dao;

import org.springframework.stereotype.Component;

import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Facture;
import com.adaming.tplocation.entities.Reservation;


@Component("factureDAO")
public class FactureDAOImpl extends GenericDaoImpl<Facture> implements IFactureDAO {

	/* (non-Javadoc)
	 * @see com.adaming.tplocation.dao.GenericDaoImpl#add(java.lang.Object)
	 */
	@Override
	public Facture add(Facture facture, Long pIdAgence, Long pIdReservation) {
		
		Agence a = em.find(Agence.class, pIdAgence);
		facture.setAgence(a);
		
		Reservation r = em.find(Reservation.class, pIdReservation);
		facture.setReservation(r);
		
		em.persist(facture);
		
		log.info(" La facture  : " + facture + " a bien été ajoutée !");
		
		return facture;
		
	}
	
	
	

}
