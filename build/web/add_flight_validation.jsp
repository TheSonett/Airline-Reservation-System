<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String flight_id=request.getParameter("flight_id");
String flight_no=request.getParameter("flight_no");
String flight_name=request.getParameter("flight_name");
String from_city=request.getParameter("from_city");
String to_city=request.getParameter("to_city");
String date_of_flight=request.getParameter("date_of_flight");
String flight_arrival_time=request.getParameter("flight_arrival_time");
String flight_reach_time=request.getParameter("flight_reach_time");
String duration=request.getParameter("duration");
String first_class_seat=request.getParameter("first_class_seat");
String first_class_seat_booked=request.getParameter("first_class_seat_booked");
String first_class_seat_aval=request.getParameter("first_class_seat_aval");
String buss_class_seat=request.getParameter("buss_class_seat");
String buss_class_seat_booked=request.getParameter("buss_class_seat_booked");
String buss_class_seat_aval=request.getParameter("buss_class_seat_aval");
String eco_class_seat=request.getParameter("eco_class_seat");
String eco_class_seat_booked=request.getParameter("eco_class_seat_booked");
String eco_class_seat_aval=request.getParameter("eco_class_seat_aval");
String first_class_price=request.getParameter("first_class_price");
String buss_class_price=request.getParameter("buss_class_price");
String eco_class_price=request.getParameter("eco_class_price");

session.setAttribute("flight_id",flight_id);

try
{
         Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/AirlineServer", "root", "");
           Statement st=conn.createStatement();
           int i=st.executeUpdate("insert into flight_details values('"+flight_id+"','"+flight_no+"','"+flight_name+"','"+from_city+"','"+to_city+"','"+date_of_flight+"','"+flight_arrival_time+"','"+flight_reach_time+"','"+duration+"',"+first_class_seat+","+first_class_seat_booked+","+first_class_seat_aval+","+buss_class_seat+","+buss_class_seat_booked+","+buss_class_seat_aval+","+eco_class_seat+","+eco_class_seat_booked+","+eco_class_seat_aval+","+first_class_price+","+buss_class_price+","+eco_class_price+")");
            response.sendRedirect("add_flight_suucess.jsp");

        }
        catch(Exception e)
        {
            response.sendRedirect("addflights_failed.jsp");
        }
 %>