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
    
    /*
    public MySQL(){
        // connection object
        Connection connection = null;
 
        try {
            String url = "jdbc:mysql://localhost:3307/residencias";
            String user = "root";
            String password = "root";
 
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to the database residencias");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }*/
    
    public void MySQLConnection(String user, String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + db_name, user, pass);
            System.out.println("Connected to the database");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("An error occurred.");
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
        }
    }
    
    
    public static void main(String[] args) {
    
    }
        
}
