package com.adaming.tplocation.dao;


import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;



import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Client;
import com.adaming.tplocation.entities.Reservation;
import com.adaming.tplocation.entities.Voiture;



@Component("reservationDAO")
public class ReservationDAOImpl extends GenericDaoImpl<Reservation> implements IReservationDAO {

	/* (non-Javadoc)
	 * @see com.adaming.tplocation.dao.GenericDaoImpl#add(java.lang.Object)
	 */
	@Override
	public Reservation add(Reservation reservation, Long pIdAgence, Long pIdClient, Long pIdVoiture) {
		
		Agence a = em.find(Agence.class, pIdAgence);
		reservation.setAgence(a);
		
		Client c = em.find(Client.class, pIdClient);
		reservation.setClient(c);
		
		Voiture v = em.find(Voiture.class, pIdVoiture);
		reservation.setVoiture(v);
		
			
		long duration  = reservation.getDateFin().getTime() - reservation.getDateDebut().getTime();
		double diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		double diffInDays = Math.floor(diffInHours/24);
			
		double prixTotal = reservation.getVoiture().getPrix()*diffInDays;
		reservation.setPrixTotal(prixTotal);

		em.persist(reservation);
		
		log.info(" La réservation  : " + reservation + " a bien été ajoutée !");
		
		return reservation;
	}

	
	
	
	

}
