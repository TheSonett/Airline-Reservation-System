<%-- 
    Document   : addFlights
    Created on : 24 Apr 2022, 1:56:30 pm
    Author     : sonet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Flights Page</title>
    </head>
    <body>
        <h1>Add New Flights</h1><br><br>
        <form action="../FlightMasterServlet", method="post">
            Flight No: <input type="text" name="flight_no"><br><br>
            Flight Name: <select type="text" name="flight_name">
                            <option value=""></option>
                            <option value="airindia">AirIndia</option>
                            <option value="indigo">Indigo</option>
                            <option value="vistara">Vistara</option>
                            <option value="spacejet">SpaceJet</option>
                        </select><br><br>
            From City: <select type="text" name="from_city">
                            <option value=""></option>
                            <option value="mumbai">Mumbai</option>
                            <option value="delhi">Delhi</option>
                            <option value="kolkata">Kolkata</option>
                            <option value="chennai">Chennai</option>
                        </select><br><br>
            To City: <select name="to_city">
                            <option value=""></option>
                            <option value="mumbai">Mumbai</option>
                            <option value="delhi">Delhi</option>
                            <option value="kolkata">Kolkata</option>
                            <option value="chennai">Chennai</option>
                      </select><br><br>
            Date of Flight: <input type="date" name="date_of_flight"><br><br>
            Departure Time: <input value="00:00:00" type="time" step="1" name="departure_timing" step="2"><br><br>
            Arrival Time: <input value="00:00:00" type="time" step="1" name="arrival_timing" step="2"><br><br>
            Duration: <input value="00:00:00" type="time" step="1" name="flight_duration" step="2"><br><br>
            Ticket Price: <input type="number" min="0.00" name="ticket_price" step="0.01"/><br><br>
            Total Seats: <input type="number" min="0" name="total_seats"><br><br>
            Available Seats: <input type="number" min="0" name="available_seats"><br><br>
            
            <input type="submit" name="addFlightsButton" value="Add"> or
        </form>
        <br>
        <form action="addFlights.jsp", method="post">
            <input type="submit" name="resetButton" value="Reset">
        </form>
        <a href="showFlights.jsp">See records</a>
    </body>
</html>
