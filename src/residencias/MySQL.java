/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author danflovier
 */

public class MySQL {
    
    private static Connection connection;

    final String port = "3306";
    final String url = "jdbc:mysql://localhost:" + port + "/";
    final String user = "root";
    final String pass = "";
    final String db_name = "residencias";
    
    public Connection MySQLConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url + db_name, user, pass);
            System.out.println("Connected to the database");
            return connection;
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("An error occurred.");
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
        }
        return connection;
    }
    
    
    public static void main(String[] args) {
    
    }
        
}
