package com.adaming.tplocation.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Facture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_facture")
	private Long idFacture;
	
	@Temporal(TemporalType.DATE)
	private Date dateFacturation;
	private String typePaiement;
	
	@ManyToOne
	@JoinColumn(name="agence_id", referencedColumnName="id_agence")
	private Agence agence;
	
	@OneToOne
	@JoinColumn(name="id_reservation", referencedColumnName="id_reservation")
	private Reservation reservation;
	
	
	/**
	 * ctor vide
	 */
	public Facture() {
		super();
	}


	/**
	 * ctor sans id
	 * @param dateFacturation
	 * @param typePaiement
	 */
	public Facture(Date dateFacturation, String typePaiement) {
		super();
		this.dateFacturation = dateFacturation;
		this.typePaiement = typePaiement;
	}


	/**
	 * ctor avec id
	 * @param idFacture
	 * @param dateFacturation
	 * @param typePaiement
	 */
	public Facture(Long idFacture, Date dateFacturation, String typePaiement) {
		super();
		this.idFacture = idFacture;
		this.dateFacturation = dateFacturation;
		this.typePaiement = typePaiement;
	}
	
	
	/* Getters & Setters */


	/**
	 * @return the idFacture
	 */
	public Long getIdFacture() {
		return idFacture;
	}


	/**
	 * @param idFacture the idFacture to set
	 */
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}


	/**
	 * @return the dateFacturation
	 */
	public Date getDateFacturation() {
		return dateFacturation;
	}


	/**
	 * @param dateFacturation the dateFacturation to set
	 */
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}


	/**
	 * @return the typePaiement
	 */
	public String getTypePaiement() {
		return typePaiement;
	}


	/**
	 * @param typePaiement the typePaiement to set
	 */
	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
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
	 * @return the reservation
	 */
	public Reservation getReservation() {
		return reservation;
	}


	/**
	 * @param reservation the reservation to set
	 */
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	
	/* Override ToString() */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", dateFacturation="
				+ dateFacturation + ", typePaiement=" + typePaiement + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
