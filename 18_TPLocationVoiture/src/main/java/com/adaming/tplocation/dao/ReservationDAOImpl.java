package com.adaming.tplocation.dao;

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
		
		em.persist(reservation);
		
		log.info(" La réservation  : " + reservation + " a bien été ajoutée !");
		
		return reservation;
	}
	
	
	
	

}
