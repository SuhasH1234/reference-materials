package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPreparedStatementExample {	// when we have predefined values getting we use PreparedStatement

	public static void main(String[] args) throws Exception {
		String url= "jdbc:mysql://localhost:3306/telusko";
		String uname= "root";
		String pass= "suhas";
		String query= "insert into users values (?,?)";
		
		int userId= 5 ;
		String username= "Shobha";
		
		Class.forName("com.mysql.jdbc.Driver");	//load and register the driver
		Connection con= DriverManager.getConnection(url, uname, pass);	//create the connection
		PreparedStatement st= con.prepareStatement(query);	//create the statement
		st.setInt(1, userId);
		st.setString(2, username);
		int count= st.executeUpdate();	//execute the query -> insert = executeUpdate
		
		System.out.println(count+ " rows affected");
		
		st.close();	//close the statement and connection
		con.close();

	}

}
