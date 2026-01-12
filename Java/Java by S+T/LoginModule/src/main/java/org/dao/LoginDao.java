package org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String url= "jdbc:mysql://localhost:3306/techtable";
	String uname1= "root";
	String pass1= "suhas";
	String query= "select * from login where uname=? and pass=?";
	
	public boolean check(String uname, String pass){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//load and register the driver
			Connection con= DriverManager.getConnection(url, uname, pass);	//create the connection
			PreparedStatement st= con.prepareStatement(query);	//create the statement
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs= st.executeQuery();
			if(rs.next()) {
				return true;
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
