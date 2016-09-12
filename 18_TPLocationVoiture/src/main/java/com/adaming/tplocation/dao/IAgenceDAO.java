package com.adaming.tplocation.dao;

import java.util.List;

import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Reservation;
import com.adaming.tplocation.entities.Voiture;

public interface IAgenceDAO extends IGenericDAO<Agence> {
	
	public List<Voiture> getListeRetours(Long pIdAgence);
	
	public List<Voiture> getListeDispos(Long pIdAgence);
	
	public double computeCA(Long pIdAgence);
	
	public List<Reservation> getHistoriqueByAgence(Long pIdAgence);
	
	public List<Reservation> getHistoriqueByClient(Long pIdAgence, Long pIdClient);
	
	
	
	

}
