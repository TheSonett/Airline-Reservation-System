/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sonet
 */
public class ShowFlights extends FlightMaster {
     private ResultSet res;
    
    public ShowFlights() {
        
    }
    
    public ResultSet showFlightList() {
        try {   
            Connection connection;
            Statement statement;
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/AirlineServer","root","");
            statement = connection.createStatement();
            String query = "SELECT * FROM flight_master";
            res = statement.executeQuery(query);
                    
            return res;
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println("Exception happned in ShowFlights.java file!!. ::: " + ex.getMessage());
            return res;
        }
    }
}
