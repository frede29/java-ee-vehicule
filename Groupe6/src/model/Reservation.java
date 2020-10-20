package model;

import java.util.Date;

public class Reservation {
	
	

	   private String immatricule,nom,prenom,modele,categorie,datelocation,dateretour,email;
	    private int id_client,telephone;
	    private float prix;
	

	public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


	public Reservation() {
		super();
	}


	public Reservation(String immatricule,  int id_client) {
		super();
		this.immatricule = immatricule;
		
		this.id_client = id_client;
	}


	/**
	 * @return the immatricule
	 */
	public String getImmatricule() {
		return immatricule;
	}


	/**
	 * @param immatricule the immatricule to set
	 */
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
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
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}


	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	/**
	 * @return the datelocation
	 */
	public String getDatelocation() {
		return datelocation;
	}


	/**
	 * @param datelocation the datelocation to set
	 */
	public void setDatelocation(String datelocation) {
		this.datelocation = datelocation;
	}


	/**
	 * @return the dateretour
	 */
	public String getDateretour() {
		return dateretour;
	}


	/**
	 * @param dateretour the dateretour to set
	 */
	public void setDateretour(String dateretour) {
		this.dateretour = dateretour;
	}


	/**
	 * @return the id_client
	 */
	public int getId_client() {
		return id_client;
	}


	/**
	 * @param id_client the id_client to set
	 */
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}


	/**
	 * @return the telephone
	 */
	public int getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}


	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}


	
}
