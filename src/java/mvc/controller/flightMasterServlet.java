/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mvc.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.FlightMaster;


/**
 *
 * @author sonet
 */
@WebServlet(name = "FlightMasterServlet", urlPatterns = {"/FlightMasterServlet"})
public class FlightMasterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightMasterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        response.setContentType("text/html");
        
        
        // My Code Below
        try {
            int flight_no = Integer.parseInt(request.getParameter("flight_no"));
            String flight_name = request.getParameter("flight_name");
            String from_city = request.getParameter("from_city");
            String to_city = request.getParameter("to_city");
            String date_of_flight = request.getParameter("date_of_flight");
            String departure_time = request.getParameter("departure_time");
            String arrival_time = request.getParameter("arrival_time");
            String flight_duration = request.getParameter("flight_duration");
            float ticket_price = Float.parseFloat(request.getParameter("ticket_price"));
            int total_seats = Integer.parseInt(request.getParameter("total_seats"));
            int available_seats = Integer.parseInt(request.getParameter("available_seats"));
            
            FlightMaster flightObj = new FlightMaster();
            flightObj.setFlight_no(flight_no);
            flightObj.setFlight_name(flight_name);
            flightObj.setFrom_city(from_city);
            flightObj.setTo_city(to_city);
            flightObj.setDate_of_flight(date_of_flight);
            flightObj.setDeparture_time(departure_time);
            flightObj.setArrival_time(arrival_time);
            flightObj.setFlight_duration(flight_duration);
            flightObj.setTicket_price(ticket_price);
            flightObj.setTotal_seats(total_seats);
            flightObj.setAvailable_seats(available_seats);
            
            boolean result = flightObj.isFlightAdded();
            if(result) {
                RequestDispatcher rd = request.getRequestDispatcher("view/success.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("view/error.jsp");
                rd.forward(request, response);
            }
            
        } catch(IOException | NumberFormatException | ServletException ex) {
            System.out.println("Exception occured inside doPost() method in flightMaterServlet.java file!!: " + ex.getMessage());
        }
        
    }
    
    public boolean getResult() {
        FlightMaster flightObj = new FlightMaster();
        return flightObj.status();
    }
}
