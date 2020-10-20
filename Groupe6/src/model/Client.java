package model;

public class Client {
	
	private String email,identite,nom,prenom,adresse,datelocation,dateretour;
	private int id_client,telephone, numpermi;
	
	
	public Client() {
		super();
	}
	
	public Client(String email, String identite, String nom, String prenom, String adresse, String datelocation,
			String dateretour, int id_client, int telephone, int numpermi) {
		super();
		this.email = email;
		this.identite = identite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.datelocation = datelocation;
		this.dateretour = dateretour;
		this.id_client = id_client;
		this.telephone = telephone;
		this.numpermi = numpermi;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the identite
	 */
	public String getIdentite() {
		return identite;
	}
	/**
	 * @param identite the identite to set
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
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
	 * @return the numpermi
	 */
	public int getNumpermi() {
		return numpermi;
	}
	/**
	 * @param numpermi the numpermi to set
	 */
	public void setNumpermi(int numpermi) {
		this.numpermi = numpermi;
	}
	

	
	
	

}
