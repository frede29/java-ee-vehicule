package model;

import java.util.List;

public interface Catalogue {
	
		public void addVehicule(Vehicule v);
	    public List<Vehicule> listVehicules();
	    public List<Vehicule> VehiculesParMC(String mc);
	    public Vehicule getVehicule(String immatricule);
	    public void updateVehicule(Vehicule v);
	    public void deleteVehicule(String immatricule);
	    public void addReservation(Reservation r);
	   
	    public List<Reservation> listReservations();
	    public List<Reservation> listReservationsClient(int idClient);
	    public void deleteReservation(int id_client);
		

}
