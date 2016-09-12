package com.adaming.tplocation.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.tplocation.dao.IReservationDAO;
import com.adaming.tplocation.entities.Reservation;

@Transactional
public class ReservationServiceImpl implements IReservationService {
	
	Logger log = Logger.getLogger("ReservationServiceImpl");
	
	private IReservationDAO dao = null;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IReservationDAO dao) {
		this.dao = dao;
		log.info("------------ DAO injecté ----------------");
	}
	
	

	@Override
	public Reservation add(Reservation resa) {
		
		return dao.add(resa);
	}
	
	
	@Override
	public Reservation add(Reservation resa, Long pIdAgence, Long pIdClient,
			Long pIdVoiture) {
		
		return dao.add(resa, pIdAgence, pIdClient, pIdVoiture);
	}
	

	@Override
	public Reservation update(Reservation resa) {
		
		return dao.update(resa);
	}

	@Override
	public List<Reservation> getAll() {
		
		return dao.getAll();
	}

	@Override
	public Reservation getById(Long pId) {
		
		return dao.getById(pId);
	}
	
	

}
