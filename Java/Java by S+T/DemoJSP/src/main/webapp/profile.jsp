<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url= "jdbc:mysql://localhost:3306/techtable";
		String uname= "root";
		String pass= "suhas";
		String query= "select * from student where sid=1000";
		
		Class.forName("com.mysql.jdbc.Driver");	//load and register the driver
		Connection con= DriverManager.getConnection(url, uname, pass);	//create the connection
		Statement st= con.createStatement();	//create the statement
		ResultSet rs= st.executeQuery(query);	//execute the query
		
		rs.next();	//process the results
	%>
	
	SID: <%= rs.getInt(1) %>	<br>
	SNAME: <%= rs.getString(2) %> <br>
	ADDRESS: <%= rs.getString(3) %> <br>
</body>
</html>