package Core;

import java.sql.*;	//import the statement

public class JdbcExample {	//fetch individual users from database

	public static void main(String[] args) throws Exception {
		String url= "jdbc:mysql://localhost:3306/telusko";
		String uname= "root";
		String pass= "suhas";
		String query= "select username from users where userId=2";
		
		Class.forName("com.mysql.jdbc.Driver");	//load and register the driver
		Connection con= DriverManager.getConnection(url, uname, pass);	//create the connection
		Statement st= con.createStatement();	//create the statement
		ResultSet rs= st.executeQuery(query);	//execute the query
		
		rs.next();	//process the results
		String name= rs.getString("username");
		
		System.out.println(name);
		
		st.close();	//close the statement and connection
		con.close();
	}

}
