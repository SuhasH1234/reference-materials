package org;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {	//printing the additition of 2 nos and passsing data from servlet through servlet
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int result= i+j;
			
//		PrintWriter out= res.getWriter();	//printing eg:1
//		out.println("Addition: " +result);
		
//		req.setAttribute("result", result); //eg:2
		
//		RequestDispatcher rd= req.getRequestDispatcher("sq");	//eg:2
//		rd.forward(req, res);
		
//		res.sendRedirect("sq?result=" +result);	//eg:3	passing a value from servlet to another servlet.also called URL Rewriting
		
//		HttpSession session= req.getSession();	//eg:4 where i have to pass multiple values
//		session.setAttribute("result", result);
//		
//		res.sendRedirect("sq");
		
		Cookie cookie= new Cookie("result", result+ "");	//eg:5 using cookies
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}
}
