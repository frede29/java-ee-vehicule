package controller;

import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Vehicule;

public class ClientModele {
	
	private List<Client> clients=new ArrayList<Client>();

	public ClientModele() {
		// TODO Auto-generated constructor stub
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	

}
