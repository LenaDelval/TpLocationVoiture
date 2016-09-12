package com.adaming.tplocation.dao;

import org.springframework.stereotype.Component;

import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Voiture;



@Component("voitureDAO")
public class VoitureDAOImpl extends GenericDaoImpl<Voiture> implements IVoitureDAO {

	/* (non-Javadoc)
	 * @see com.adaming.tplocation.dao.GenericDaoImpl#add(java.lang.Object)
	 */
	@Override
	public Voiture add(Voiture voiture, Long pIdAgence) {
		
		Agence a = em.find(Agence.class, pIdAgence);
		voiture.setAgence(a);
		
		em.persist(voiture);
		
		log.info(" La voiture  : " + voiture + " a bien été ajoutée !");
		
		return voiture;
		
	}
	
	

}
