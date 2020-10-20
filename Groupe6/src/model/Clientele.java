package model;

import java.util.List;

public interface Clientele {
	    public void addClient(Client c);
	    public List<Client> listClients();
	    public Client getClient(int id_client);
	    public void updateClient(Client c);
	    public void deleteClient(int id_client);
	    

}
