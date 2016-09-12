package com.adaming.tplocation.service;

import com.adaming.tplocation.entities.Facture;

public interface IFactureService extends IGenericService<Facture> {

	public Facture add(Facture facture, Long pIdAgence, Long pIdReservation);
	
	

}
