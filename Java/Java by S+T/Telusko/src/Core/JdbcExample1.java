package Core;

import java.sql.*;	//import the statement

public class JdbcExample1 {	//fetch all users in database

	public static void main(String[] args) throws Exception {
		String url= "jdbc:mysql://localhost:3306/telusko";
		String uname= "root";
		String pass= "suhas";
		String query= "select * from users";
		
		Class.forName("com.mysql.jdbc.Driver");	//load and register the driver
		Connection con= DriverManager.getConnection(url, uname, pass);	//create the connection
		Statement st= con.createStatement();	//create the statement
		ResultSet rs= st.executeQuery(query);	//execute the query
		
		while(rs.next()) {
			String userData= rs.getInt(1)+ ":" +rs.getString(2);
			System.out.println(userData);
		}
		
		st.close();	//close the statement and connection
		con.close();
	}

}
