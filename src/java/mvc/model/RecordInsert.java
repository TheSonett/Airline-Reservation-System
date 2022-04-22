/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

/**
 *
 * @author sonet
 */
import java.sql.*;

public class RecordInsert {
	public String u_id, pass;

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean fnc() {
		try {
                    Connection con;
		    Statement stmt;
		    Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3308/flower","root","");
		    stmt=con.createStatement();
		    String sql="insert into login (username,password) values('"+u_id+"','"+pass+"')";
		    stmt.executeUpdate(sql);
		    con.close();
		    return true;
		}
		catch (Exception e) {
                    return false;
		}
	}
}

