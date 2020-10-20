package model;

import java.io.Serializable;

public class Vehicule implements Serializable {
	
	private String immatricule,modele,categorie;
	private int nbreplace;
	private double prix;

		public Vehicule() {
		super();
	}
	public Vehicule(String immatricule, String modele, String categorie, int nbreplace,float prix) {
		super();
		this.immatricule = immatricule;
		this.modele = modele;
		this.categorie = categorie;
		this.nbreplace = nbreplace;
		this.prix = prix;
	}
	public String getImmatricule() {
		return immatricule;
	}
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getNbreplace() {
		return nbreplace;
	}
	public void setNbreplace(int nbreplace) {
		this.nbreplace = nbreplace;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}





	    
	}
	
	


