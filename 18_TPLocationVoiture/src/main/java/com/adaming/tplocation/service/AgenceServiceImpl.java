package com.adaming.tplocation.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.tplocation.dao.IAgenceDAO;
import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Reservation;
import com.adaming.tplocation.entities.Voiture;


@Transactional
public class AgenceServiceImpl implements IAgenceService {
	
	
	Logger log = Logger.getLogger("AgenceServiceImpl");
	
	private IAgenceDAO dao = null;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IAgenceDAO dao) {
		this.dao = dao;
		log.info("------------ DAO injecté ----------------");
	}
	
	

	@Override
	public Agence add(Agence agence) {
		
		return dao.add(agence);
	}
	

	@Override
	public Agence update(Agence agence) {
		
		return dao.update(agence);
	}

	@Override
	public List<Agence> getAll() {
		
		return dao.getAll();
	}

	@Override
	public Agence getById(Long pId) {
		
		return dao.getById(pId);
	}



	@Override
	public List<Voiture> getListeRetours(Long pIdAgence) {
		
		return dao.getListeRetours(pIdAgence);
	}



	@Override
	public List<Voiture> getListeDispos(Long pIdAgence) {
		
		return dao.getListeDispos(pIdAgence);
	}



	@Override
	public double computeCA(Long pIdAgence) {
		
		return dao.computeCA(pIdAgence);
		
	}



	@Override
	public List<Reservation> getHistoriqueByAgence(Long pIdAgence) {
		
		return dao.getHistoriqueByAgence(pIdAgence);
	}



	@Override
	public List<Reservation> getHistoriqueByClient(Long pIdAgence,
			Long pIdClient) {
	
		return dao.getHistoriqueByClient(pIdAgence, pIdClient);
	}

}
