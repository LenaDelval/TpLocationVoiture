package com.adaming.tplocation.service;

import com.adaming.tplocation.entities.Voiture;

public interface IVoitureService extends IGenericService<Voiture>{

	public Voiture add(Voiture voiture, Long pIdAgence);
	
	
	

}
