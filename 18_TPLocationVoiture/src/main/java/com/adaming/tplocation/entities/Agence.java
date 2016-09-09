package com.adaming.tplocation.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Agence {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agence")
	private Long idAgence;
	
	private String nom;
	private String adresse;
	private String telephone;
	private String mail;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="agence_clients",
			joinColumns= @JoinColumn(name="agence_id", referencedColumnName="id_agence"),
						inverseJoinColumns=@JoinColumn(name="client_id"))
	private List<Client> listeClients;
	
	@OneToMany(mappedBy="agence", fetch=FetchType.EAGER)
	private List<Reservation> listeReservations;
	
	@OneToMany(mappedBy="agence")
	private List<Voiture> listeVoitures;
	
	@OneToMany(mappedBy="agence")
	private List<Facture> listeFactures;
	
	
	/**
	 * ctor vide
	 */
	public Agence() {
		super();
	}


	/**
	 * ctor sans id
	 * @param nom
	 * @param adresse
	 * @param telephone
	 * @param mail
	 */
	public Agence(String nom, String adresse, String telephone, String mail) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
	}


	/**
	 * ctor avec id
	 * @param idAgence
	 * @param nom
	 * @param adresse
	 * @param telephone
	 * @param mail
	 */
	public Agence(Long idAgence, String nom, String adresse, String telephone,
			String mail) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
	}
	
	
	/* Getters & Setters */


	/**
	 * @return the idAgence
	 */
	public Long getIdAgence() {
		return idAgence;
	}


	/**
	 * @param idAgence the idAgence to set
	 */
	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}


	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}


	/**
	 * @return the listeClients
	 */
	public List<Client> getListeClients() {
		return listeClients;
	}


	/**
	 * @param listeClients the listeClients to set
	 */
	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
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


	/**
	 * @return the listeVoitures
	 */
	public List<Voiture> getListeVoitures() {
		return listeVoitures;
	}


	/**
	 * @param listeVoitures the listeVoitures to set
	 */
	public void setListeVoitures(List<Voiture> listeVoitures) {
		this.listeVoitures = listeVoitures;
	}


	/**
	 * @return the listeFactures
	 */
	public List<Facture> getListeFactures() {
		return listeFactures;
	}


	/**
	 * @param listeFactures the listeFactures to set
	 */
	public void setListeFactures(List<Facture> listeFactures) {
		this.listeFactures = listeFactures;
	}

	
	/* Override ToString() */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", nom=" + nom + ", adresse="
				+ adresse + ", telephone=" + telephone + ", mail=" + mail + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
	

}
