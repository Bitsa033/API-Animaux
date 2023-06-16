package com.service.security;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String sexe;
	private int qte;
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	public Animal( String nom, String sexe, int qte) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.qte = qte;
	}
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
