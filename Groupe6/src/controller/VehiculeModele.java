package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Vehicule;

public class VehiculeModele {
	private String motCle;
    
    private List<Vehicule> vehicules=new ArrayList<Vehicule>();
  
    
    public VehiculeModele() {
        // TODO Auto-generated constructor stub
        
    }

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	
	
    
    
    
}