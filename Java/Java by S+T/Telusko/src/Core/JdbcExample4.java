package Core;

import java.sql.*;	//import the statement

public class JdbcExample4 {	//delete users in database

	public static void main(String[] args) throws Exception {
		String url= "jdbc:mysql://localhost:3306/telusko";
		String uname= "root";
		String pass= "suhas";
		String query= "delete from users where userId=5";	//delete query
		
		Class.forName("com.mysql.jdbc.Driver");	//load and register the driver
		Connection con= DriverManager.getConnection(url, uname, pass);	//create the connection
		Statement st= con.createStatement();	//create the statement
		int count= st.executeUpdate(query);	//execute the query -> delete = executeUpdate
		
		System.out.println(count+ " rows affected");
		
		st.close();	//close the statement and connection
		con.close();
	}

}
