package com.adaming.tplocation.service;

import java.util.List;

import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Reservation;
import com.adaming.tplocation.entities.Voiture;

public interface IAgenceService extends IGenericService<Agence> {
	
	
	public List<Voiture> getListeRetours(Long pIdAgence);
	
	public List<Voiture> getListeDispos(Long pIdAgence);
	
	public double computeCA(Long pIdAgence);
	
	public List<Reservation> getHistoriqueByAgence(Long pIdAgence);
	
	public List<Reservation> getHistoriqueByClient(Long pIdAgence, Long pIdClient);
	
	

}
