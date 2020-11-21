package control;
import java.sql.*;

public class bdd {

    public bdd() {
        try {
            // Exemple de chaine pour MySQL
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/imprimantes","root","root");

            Statement instanceConn = conn.createStatement();
            ResultSet recordset = instanceConn.executeQuery("SELECT idImprimante FROM salle INNER JOIN imprimante on salle.idsalle=imprimante.idsalle where salle.idsalle='106' ");

            while (recordset.next()) {
                System.out.println(recordset.getString("idImprimante"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}