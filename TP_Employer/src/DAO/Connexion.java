
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    // établir la Connexion et traiter les données
    private static final String URL =  "jdbc:mysql://localhost:3306/gestion_employer";
    private static final String User = "root";
    private static final String Password = "";
    static Connection conn = null;

    //méthode pour Obtenir une connection
    public static Connection getconnexion(){
        try {
            conn = DriverManager.getConnection (URL , User , Password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
