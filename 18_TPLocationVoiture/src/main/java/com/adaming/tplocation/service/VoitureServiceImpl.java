package com.adaming.tplocation.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.tplocation.dao.IVoitureDAO;
import com.adaming.tplocation.entities.Voiture;

@Transactional
public class VoitureServiceImpl implements IVoitureService {
	
	Logger log = Logger.getLogger("VoitureServiceImpl");
	
	private IVoitureDAO dao = null;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IVoitureDAO dao) {
		this.dao = dao;
		log.info("------------ DAO injecté ----------------");
	}
	

	@Override
	public Voiture add(Voiture voiture) {
		
		return dao.add(voiture);
	}
	
	@Override
	public Voiture add(Voiture voiture,Long pIdAgence) {
		
		return dao.add(voiture, pIdAgence);
	}

	@Override
	public Voiture update(Voiture voiture) {
		return dao.update(voiture);
	}

	@Override
	public List<Voiture> getAll() {
	
		return dao.getAll();
	}

	@Override
	public Voiture getById(Long pId) {
		
		return dao.getById(pId);
	}

}
