package com.adaming.tplocation.dao;

import com.adaming.tplocation.entities.Voiture;

public interface IVoitureDAO extends IGenericDAO<Voiture>{

	public Voiture add(Voiture voiture, Long pIdAgence);
	
	

}
