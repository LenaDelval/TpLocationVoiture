package com.adaming.tplocation.dao;

import com.adaming.tplocation.entities.Facture;

public interface IFactureDAO extends IGenericDAO<Facture>{
	

	public Facture add(Facture facture, Long pIdAgence, Long pIdReservation);
	
	

}
