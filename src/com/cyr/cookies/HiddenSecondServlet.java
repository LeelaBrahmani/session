package com.cyr.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenSecondServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			String n = req.getParameter("uname");
			out.print("hello"+n);
			out.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
