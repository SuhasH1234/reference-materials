package org;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		PrintWriter out= res.getWriter();
		out.print("Hi");
		
//		ServletContext ctx= getServletContext();	//ServletContext from web.xml
//		String str= ctx.getInitParameter("name");	//eg:1
//		out.println(str);
		
		ServletConfig cfg= getServletConfig();	//ServletConfig from web.xml
		String str= cfg.getInitParameter("name");	//eg:2
		out.println(str);
	}
}
