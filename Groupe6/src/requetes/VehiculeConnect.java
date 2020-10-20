package requetes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 

public class VehiculeConnect {

 

    
        private static Connection connection;
           
        static {
        String    url="jdbc:mysql://localhost:3306/location"                   
                +"?useSSL=false&useUnicode=true"
                +"&useJDBCCompliantTimezoneShift=true"
                +"&useLegacyDatetimeCode=false"
                +"&serverTimezone=UTC"
                +"&allowPublicKeyRetrieval=true";
       
           
            //parametre de connexion
        //String url="\"jdbc:mysql://localhost:3306/tp_jdbc";
        String login="root";
        String password="";
       
       
        //creation d'une connection avec driveManager
        Connection cn=null;
       
        try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, login, password);
        System.out.println("connexion reussie");
        }
        catch(ClassNotFoundException e) {
            System.err.println("Erreur de chargement du driver");
            e.printStackTrace();
        }
       
        catch(SQLException e) {
            System.err.println("Erreur d'etablissement de connexion");
            e.printStackTrace();
        }
        }
        public static Connection getConnection() {
            return connection;
        }
        
    }