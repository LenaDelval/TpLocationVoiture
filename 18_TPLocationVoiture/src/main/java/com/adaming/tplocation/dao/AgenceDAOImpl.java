package com.adaming.tplocation.dao;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adaming.tplocation.entities.Agence;
import com.adaming.tplocation.entities.Client;
import com.adaming.tplocation.entities.Reservation;
import com.adaming.tplocation.entities.Voiture;

@Component("agenceDAO")
public class AgenceDAOImpl extends GenericDaoImpl<Agence> implements IAgenceDAO {

	@Override
	public List<Voiture> getListeRetours(Long pIdAgence) {

		List<Reservation> listeResas = getHistoriqueByAgence(pIdAgence);
		List<Voiture> listeRetours = new ArrayList<Voiture>();

		Calendar dateActuelle = Calendar.getInstance();

		for (Reservation resa : listeResas) {

			Date dateFin = resa.getDateFin();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateFin);
			int jourRetour = cal.get(Calendar.DAY_OF_YEAR);
			int anneeRetour = cal.get(Calendar.YEAR);

			if (jourRetour == dateActuelle.get(Calendar.DAY_OF_YEAR)
					&& anneeRetour == dateActuelle.get(Calendar.YEAR)) {

				listeRetours.add(resa.getVoiture());

			}

		}

		log.info(listeRetours.size() + " retours aujourd'hui.");

		return listeRetours;
	}

	@Override
	public List<Voiture> getListeDispos(Long pIdAgence) {

		Agence a = getById(pIdAgence);
		List<Voiture> listeVoitures = a.getListeVoitures();
		List<Voiture> listeDispos = new ArrayList<Voiture>();

		System.out.println("taille liste voitures : " + listeVoitures.size());

		Calendar dateActuelle = Calendar.getInstance();

		for (Voiture voiture : listeVoitures) {

			List<Reservation> listeResas = voiture.getListeReservations();

			if (listeResas.size() > 0) {

				Reservation lastResa = listeResas.get(listeResas.size() - 1);

				Date dateFin = lastResa.getDateFin();
				Calendar dateFin2 = Calendar.getInstance();
				dateFin2.setTime(dateFin);

				double testDate = dateFin2.compareTo(dateActuelle);

				if (testDate < 0) {

					listeDispos.add(voiture);
					

				}

			}

		}

		log.info("L'agence " + a + " a " + listeDispos.size()
				+ "voitures dispos.");
		return listeDispos;
	}
	

	@Override
	public double computeCA(Long pIdAgence) {

		Agence a = getById(pIdAgence);

		List<Reservation> listeResas = a.getListeReservations();

		Calendar dateActuelle = Calendar.getInstance();

		double CA = 0;

		for (Reservation resa : listeResas) {

			Date datedebut = resa.getDateDebut();
			Calendar cal = Calendar.getInstance();
			cal.setTime(datedebut);
			int anneeResa = cal.get(Calendar.YEAR);

			if (anneeResa == dateActuelle.get(Calendar.YEAR)) {

				CA = CA + resa.getPrixTotal();

			}

		}

		log.info("Le CA Annuel de l'agence " + a + " est de " + CA + " Euros.");
		return CA;
	}

	@Override
	public List<Reservation> getHistoriqueByAgence(Long pIdAgence) {

		Agence a = getById(pIdAgence);
		List<Reservation> historique = a.getListeReservations();

		log.info("Historique de l'agence " + a + " : ");

		for (Reservation resa : historique) {

			log.info(resa.toString());

		}

		return historique;
	}

	@Override
	public List<Reservation> getHistoriqueByClient(Long pIdAgence,
			Long pIdClient) {

		Agence a = getById(pIdAgence);

		Client c = new Client();

		List<Client> clients = a.getListeClients();

		for (Client client : clients) {

			if (client.getIdClient() == pIdClient) {

				c = client;

			}

		}

		List<Reservation> historique = c.getListeReservations();

		log.info("Historique du client " + c + " : ");

		for (Reservation resa : historique) {

			log.info(resa.toString());

		}

		return historique;
	}

}
