package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;



import requetes.VehiculeConnect;

public class ClientVehicule implements Clientele {
	public void addClient(Client c) {
        // TODO Auto-generated method stub
		System.out.println("add client");
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("insert into client (nom,prenom,adresse,telephone,email,identite,numpermi,datelocation,dateretour) values (?,?,?,?,?,?,?,?,?)");
           
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getAdresse());
            ps.setInt(4, c.getTelephone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getIdentite());           
            ps.setInt(7, c.getNumpermi());
            ps.setString(8, c.getDatelocation());
            ps.setString(9, c.getDateretour());
           
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public List<Client> listClients() {
        // TODO Auto-generated method stub
        List<Client> cli=new ArrayList<Client>();
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select * from client");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                Client c=new Client();
            c.setId_client(rs.getInt("id_client"));    
            c.setNom(rs.getString("nom"));
            c.setPrenom(rs.getString("Prenom"));
            c.setIdentite(rs.getString("identite"));
            c.setAdresse(rs.getString("adresse"));
            c.setEmail(rs.getString("email"));
            c.setTelephone(rs.getInt("telephone"));
            c.setNumpermi(rs.getInt("numpermi"));
            c.setDatelocation(rs.getString("datelocation"));
            c.setDateretour(rs.getString("dateretour"));
            cli.add(c);
            }
            ps.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       return cli;
        
    }
    public Client getClientbyEmail(String email) {
        // TODO Auto-generated method stub
        Client c=null; 
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select * from Client where email=?");
            ps.setString(1,email);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
            c=new Client();
            c.setId_client(rs.getInt("id_client"));
            }
            ps.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(c==null) throw new RuntimeException ("ce "+email+" est introuvable");
        return c;
    }
    public Client getClient(int id_client) {
        // TODO Auto-generated method stub
        Client c=null; 
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select nom,prenom,identite,adresse,email,telephone,numpermi,datelocation,dateretour from vehicule where id_client=?");
            ps.setInt(1, id_client);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
            c=new Client();
            c.setNom(rs.getString("nom"));
            c.setPrenom(rs.getString("Prenom"));
            c.setIdentite(rs.getString("identite"));
            c.setAdresse(rs.getString("adresse"));
            c.setEmail(rs.getString("email"));
            c.setTelephone(rs.getInt("telephone"));
            c.setNumpermi(rs.getInt("numpermi"));
            c.setDatelocation(rs.getString("datelocation"));
            c.setDateretour(rs.getString("dateretour"));
            }
            ps.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(c==null) throw new RuntimeException ("vehicule"+id_client+"introuvable");
        return c;
    }

    public void updateClient(Client c) {
        // TODO Auto-generated method stub
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("update client set nom=?, prenom=?, identite=?, adresse=?, email=?, telephone=?, numpermi=?,datelocation=?,dateretour=? where id_client=?");
            ps.setInt(1, c.getId_client());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getPrenom());
            ps.setString(4, c.getIdentite());
            ps.setString(5, c.getAdresse());
            ps.setString(6, c.getEmail());
            ps.setInt(7, c.getTelephone());
            ps.setInt(8, c.getNumpermi());
            ps.setString(9, c.getDatelocation());
            ps.setString(10, c.getDateretour());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
    public void deleteClient(int id_client) {
        // TODO Auto-generated method stub
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("delete from client where id_client=?");
            ps.setInt(1, id_client);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        
        }
    }

}
