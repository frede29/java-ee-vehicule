        package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import requetes.VehiculeConnect;

public class CatalogueVehicule implements Catalogue {

	public void addVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("insert into vehicule (immatricule,modele,categorie,nbreplace,prix) values (?,?,?,?,?)");
            ps.setString(1, v.getImmatricule());
            ps.setString(2, v.getModele());
            ps.setString(3, v.getCategorie());
            ps.setInt(4, v.getNbreplace());
            ps.setDouble(5, v.getPrix());
           
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public List<Vehicule> listVehicules() {
		List<Vehicule> vehi=new ArrayList<Vehicule>();
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select * from vehicule");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                Vehicule vh=new Vehicule();
            vh.setImmatricule(rs.getString("immatricule"));
            vh.setModele(rs.getString("modele"));
            vh.setCategorie(rs.getString("categorie"));
            vh.setNbreplace(rs.getInt("nbreplace"));
            vh.setPrix(rs.getDouble("prix"));
            System.out.println(vh.getImmatricule());
            vehi.add(vh);
            }
            ps.close();
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       return vehi;
    }
	 public List<Vehicule> VehiculesParMC(String mc)
	 {
		 List<Vehicule> vehi=new ArrayList<Vehicule>();
	        Connection cn=VehiculeConnect.getConnection();
	        try {
	            PreparedStatement ps=cn.prepareStatement("select * from vehicule where modele like ?");
	            ps.setString(1, "%"+mc+"%");
	            ResultSet rs=ps.executeQuery();
	            while(rs.next()) {
	                Vehicule vh=new Vehicule();
	            vh.setImmatricule(rs.getString("immatricule"));
	            vh.setModele(rs.getString("modele"));
	            vh.setCategorie(rs.getString("categorie"));
	            vh.setNbreplace(rs.getInt("nbreplace"));
	            vh.setPrix(rs.getDouble("prix"));
	            
	            vehi.add(vh);
	            }
	            ps.close();
	           
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	       return vehi;
	 }
	

	
	public Vehicule getVehicule(String immatricule) {
        Vehicule v=null;
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select immatricule,categorie,modele,nbreplace,prix from vehicule where immatricule=?");
            ps.setString(1, immatricule);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
            v=new Vehicule();
            v.setImmatricule(rs.getString("immatricule"));
            v.setModele(rs.getString("modele"));
            v.setCategorie(rs.getString("categorie"));
            v.setNbreplace(rs.getInt("nbreplace"));
            v.setPrix(rs.getFloat("prix"));
           
            }
            ps.close();
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(v==null) throw new RuntimeException ("vehicule introuvable");
        return v;
    }

	
	public void updateVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("update vehicule set categorie=?, modele=?, nbreplace=?,prix=? where immatricule=?");
            ps.setString(5, v.getImmatricule());
            ps.setString(2, v.getModele());
            ps.setString(1, v.getCategorie());
            ps.setInt(3, v.getNbreplace());
            ps.setDouble(4, v.getPrix());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

	
	public void deleteVehicule(String immatricule) {
		// TODO Auto-generated method stub
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("delete vehicule where immatricule=?");
            ps.setString(1, immatricule);
           
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}
	public void addReservation(Reservation r)
	{
		
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("insert into loue (immatricule,id_client) values (?,?)");
           System.out.println(r.getId_client());
            ps.setString(1,  r.getImmatricule());
            ps.setInt(2,  r.getId_client());
 
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
    
    
	 public List<Reservation> listReservations()
	    {
	        List<Reservation> reserv=new ArrayList<Reservation>();
	        Connection cn=VehiculeConnect.getConnection();
	        try {
	            PreparedStatement ps=cn.prepareStatement("SELECT c.id_client,nom,email,prenom,modele,categorie,v.immatricule,datelocation,dateretour,telephone,prix FROM client c, vehicule v, loue l WHERE c.id_client = l.id_client and v.immatricule=l.immatricule");
	            ResultSet rs=ps.executeQuery();
	            while(rs.next()) {
	                Reservation vh=new Reservation();
	                vh.setCategorie(rs.getString("categorie"));
	                vh.setModele(rs.getString("modele"));
	                vh.setNom(rs.getString("nom"));
	                vh.setPrenom(rs.getString("prenom"));
	                vh.setId_client(rs.getInt("id_client"));
	                vh.setImmatricule(rs.getString("immatricule"));
	                vh.setDatelocation(rs.getString("datelocation"));
	                vh.setDateretour(rs.getString("dateretour"));
	                vh.setTelephone(rs.getInt("telephone"));
	                vh.setPrix(rs.getFloat("Prix"));
	                vh.setEmail(rs.getString("email"));
	          
	           System.out.println(vh.toString());
	           
	            reserv.add(vh);
	            }
	            ps.close();
	          
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	       return reserv;
	       
	    }







public List<Reservation> listReservationsClient(int idClient)
{
	System.out.println("je sui Le client "+idClient);
    List<Reservation> reserv=new ArrayList<Reservation>();
    Connection cn=VehiculeConnect.getConnection();
    try {
        PreparedStatement ps=cn.prepareStatement("SELECT c.id_client,nom,prenom,modele,email,categorie,v.immatricule,datelocation,dateretour,telephone,prix "
        										+ "FROM client c, vehicule v, loue l "
        										+ "WHERE c.id_client = l.id_client and v.immatricule=l.immatricule and c.id_client=?");
        ps.setInt(1, idClient);
        ResultSet rs=ps.executeQuery();
        while(rs.next()) {
        	System.out.println("je sui Le client "+idClient);
            Reservation vh=new Reservation();
            vh.setCategorie(rs.getString("categorie"));
            vh.setModele(rs.getString("modele"));
            vh.setNom(rs.getString("nom"));
            vh.setPrenom(rs.getString("prenom"));
            vh.setId_client(rs.getInt("id_client"));
            vh.setImmatricule(rs.getString("immatricule"));
            vh.setDatelocation(rs.getString("datelocation"));
            vh.setDateretour(rs.getString("dateretour"));
            vh.setTelephone(rs.getInt("telephone"));
            vh.setPrix(rs.getFloat("Prix"));
            vh.setEmail(rs.getString("email"));
      
       System.out.println(vh.toString());
       
        reserv.add(vh);
        }
        ps.close();
      
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
   return reserv;
   
}

public void deleteReservation(int id_client) {
	// TODO Auto-generated method stub
	Connection cn=VehiculeConnect.getConnection();
    try {
        PreparedStatement ps=cn.prepareStatement("delete immatricule,id_client from loue where id_client=?");
        ps.setInt(1, id_client);
       
        ps.executeUpdate();
        ps.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}

}
