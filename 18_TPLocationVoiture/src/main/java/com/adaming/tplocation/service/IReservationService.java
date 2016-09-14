package com.adaming.tplocation.service;

import com.adaming.tplocation.entities.Reservation;

public interface IReservationService extends IGenericService<Reservation> {

	public Reservation add(Reservation resa, Long pIdAgence, Long pIdClient,
			Long pIdVoiture);



}
