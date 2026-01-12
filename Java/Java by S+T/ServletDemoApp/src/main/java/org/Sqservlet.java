package org;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class Sqservlet extends HttpServlet {	//getting data from servlet through servlet
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int result= (int) req.getAttribute("result"); //eg:2
		
//		int result= Integer.parseInt(req.getParameter("result"));	//eg:3
		
//		HttpSession session= req.getSession();	//eg:4 passing multiple values
//		int result= (int) session.getAttribute("result");
		
		int result=0;	//eg:5 using cookies
		Cookie cookies[]= req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("result")) {
				result=Integer.parseInt(c.getValue());
			}
		}
		
		result= result*result;
		
		PrintWriter out= res.getWriter();
		out.println("Result is: "+result);
	}
}