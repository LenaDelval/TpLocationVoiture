package com.adaming.tplocation.dao;

import com.adaming.tplocation.entities.Reservation;

public interface IReservationDAO extends IGenericDAO<Reservation>{

	public Reservation add(Reservation reservation, Long pIdAgence, Long pIdClient,
			Long pIdVoiture);

}
