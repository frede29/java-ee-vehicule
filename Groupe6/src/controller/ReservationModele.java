package controller;

import java.util.ArrayList;
import java.util.List;

import model.Reservation;
import model.Vehicule;

public class ReservationModele {

    private List<Reservation> reserv=new ArrayList<Reservation>();
    
	
	/**
	 * @return the reserv
	 */
	public List<Reservation> getReserv() {
		return reserv;
	}
	/**
	 * @param reserv the reserv to set
	 */
	public void setReserv(List<Reservation> reserv) {
		this.reserv = reserv;
	}
    
    

}
