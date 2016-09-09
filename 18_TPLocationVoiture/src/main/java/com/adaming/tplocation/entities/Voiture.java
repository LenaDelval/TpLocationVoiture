package com.adaming.tplocation.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Voiture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_voiture")	
	private Long idVoiture;
	
	private int kilometrage;
	private String modele;
	private int annee;
	private double prix;
	private String immatriculation;
	
	@ManyToOne
	@JoinColumn(name="agence_id", referencedColumnName="id_agence")
	private Agence agence;
	
	@OneToMany(mappedBy="voiture")
	private List<Reservation> listeReservations;

	/**
	 * ctor vide
	 */
	public Voiture() {
		super();
	}

	/**
	 * ctor sans id
	 * @param kilometrage
	 * @param modele
	 * @param annee
	 * @param prix
	 * @param immatriculation
	 */
	public Voiture(int kilometrage, String modele, int annee, double prix,
			String immatriculation) {
		super();
		this.kilometrage = kilometrage;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
		this.immatriculation = immatriculation;
	}

	/**
	 * ctor avec id
	 * @param idVoiture
	 * @param kilometrage
	 * @param modele
	 * @param annee
	 * @param prix
	 * @param immatriculation
	 */
	public Voiture(Long idVoiture, int kilometrage, String modele, int annee,
			double prix, String immatriculation) {
		super();
		this.idVoiture = idVoiture;
		this.kilometrage = kilometrage;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
		this.immatriculation = immatriculation;
	}
	
	
	/* Getters & Setters */

	/**
	 * @return the idVoiture
	 */
	public Long getIdVoiture() {
		return idVoiture;
	}

	/**
	 * @param idVoiture the idVoiture to set
	 */
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	/**
	 * @return the kilometrage
	 */
	public int getKilometrage() {
		return kilometrage;
	}

	/**
	 * @param kilometrage the kilometrage to set
	 */
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}

	/**
	 * @param immatriculation the immatriculation to set
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/**
	 * @return the listeReservations
	 */
	public List<Reservation> getListeReservations() {
		return listeReservations;
	}

	/**
	 * @param listeReservations the listeReservations to set
	 */
	public void setListeReservations(List<Reservation> listeReservations) {
		this.listeReservations = listeReservations;
	}
	
	/* Override ToString() */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", kilometrage="
				+ kilometrage + ", modele=" + modele + ", annee=" + annee
				+ ", prix=" + prix + ", immatriculation=" + immatriculation
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
