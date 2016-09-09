package com.adaming.tplocation.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private Long idClient;
	
	private String nom;
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Temporal(TemporalType.DATE)
	private Date datePermis;
	
	private String telephone;
	private String mail;
	private String adresse;
	
	@ManyToMany(mappedBy="listeClients",cascade=CascadeType.ALL)
	private List<Agence> listeAgences;
	
	@OneToMany(mappedBy="client")
	private List<Reservation> listeReservations;

	/**
	 * Ctor vide
	 */
	public Client() {
		super();
	}

	/**
	 * Ctor sans Id
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param datePermis
	 * @param telephone
	 * @param mail
	 * @param adresse
	 */
	public Client(String nom, String prenom, Date dateNaissance,
			Date datePermis, String telephone, String mail, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.datePermis = datePermis;
		this.telephone = telephone;
		this.mail = mail;
		this.adresse = adresse;
	}

	/**
	 * Ctor avec Id
	 * @param idClient
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param datePermis
	 * @param telephone
	 * @param mail
	 * @param adresse
	 */
	public Client(Long idClient, String nom, String prenom,
			Date dateNaissance, Date datePermis, String telephone,
			String mail, String adresse) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.datePermis = datePermis;
		this.telephone = telephone;
		this.mail = mail;
		this.adresse = adresse;
	}
	
	
	/*Getters & Setters*/

	/**
	 * @return the idClient
	 */
	public Long getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the datePermis
	 */
	public Date getDatePermis() {
		return datePermis;
	}

	/**
	 * @param datePermis the datePermis to set
	 */
	public void setDatePermis(Date datePermis) {
		this.datePermis = datePermis;
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
	 * @return the listeAgences
	 */
	public List<Agence> getListeAgences() {
		return listeAgences;
	}

	/**
	 * @param listeAgences the listeAgences to set
	 */
	public void setListeAgences(List<Agence> listeAgences) {
		this.listeAgences = listeAgences;
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
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom="
				+ prenom + ", dateNaissance=" + dateNaissance
				+ ", datePermis=" + datePermis + ", telephone=" + telephone
				+ ", mail=" + mail + ", adresse=" + adresse + "]";
	}
	
	
	
	
	
	
	
	
	

}
