package com.cyr.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			String n =req.getParameter("username");
			out.print("Welcome"+n);
			out.print("<form action='hiddenservlet2' method='get'>");
			out.print("<input type='hidden' name='uname' value='"+n+"'>");  
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
