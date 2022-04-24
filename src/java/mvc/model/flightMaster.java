package mvc.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

public class flightMaster {
    private int flight_no;
    private String flight_name;
    private String from_city;
    private String to_city;
    private Date date_of_flight;
    private Time departure_time;
    private Time arrival_time;
    private Time flight_duration;
    private double ticket_price;
    private int total_seats;
    private int available_seats;
  
    private String status;
    
    public flightMaster() {
        
    }
    
    public boolean isFlightAdded() {
        try {
            Connection connection;
            Statement statement;
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/AirlineServer","root","");
            statement = connection.createStatement();
            String query = "INSERT INTO flight_master "
                        + "(flight_no, flight_name, from_city, to_city, date_of_flight, start_time, end_time, flight_duration, ticket_price, total_seats, available_seats)"
                        + "VALUES ("+ flight_no +", '" + flight_name + "', '" + from_city + "', '" + to_city + "', '" + date_of_flight + "', '" + departure_time + "', '" + arrival_time + "', '" + flight_duration + "', " + ticket_price + ", " + total_seats + ", " + available_seats + ");";
            statement.executeUpdate(query);
            connection.close();
            return true;
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println("Added Flights exception error in flightMaster.java file !!: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean status() {
        if(isFlightAdded()) {
            status = "Flight added successfully!";
            return true;
        }
        return false;
    }
    
    
    // Getter & setter methods
    public int getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public String getFrom_city() {
        return from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public Date getDate_of_flight() {
        return date_of_flight;
    }

    public void setDate_of_flight(Date date_of_flight) {
        this.date_of_flight = date_of_flight;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Time departure_time) {
        this.departure_time = departure_time;
    }

    public Time getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Time arrival_time) {
        this.arrival_time = arrival_time;
    }

    public Time getFlight_duration() {
        return flight_duration;
    }

    public void setFlight_duration(Time flight_duration) {
        this.flight_duration = flight_duration;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
}
