package com.adaming.tplocation.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;




import com.adaming.tplocation.dao.IFactureDAO;
import com.adaming.tplocation.entities.Facture;

@Transactional
public class FactureServiceImpl implements IFactureService {
	
	Logger log = Logger.getLogger("FactureServiceImpl");
	
	private IFactureDAO dao = null;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IFactureDAO dao) {
		this.dao = dao;
		log.info("------------ DAO injecté ----------------");
	}
	
	

	@Override
	public Facture add(Facture facture) {
		
		return dao.add(facture);
	}
	
	@Override
	public Facture add(Facture facture, Long pIdAgence, Long pIdReservation) {
		return dao.add(facture, pIdAgence, pIdReservation);
	}
	

	@Override
	public Facture update(Facture facture) {

		return dao.update(facture);
	}

	@Override
	public List<Facture> getAll() {
		
		return dao.getAll();
	}

	@Override
	public Facture getById(Long pId) {
		
		return dao.getById(pId);
	}
	
	
	

}
