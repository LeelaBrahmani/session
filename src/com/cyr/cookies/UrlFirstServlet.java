package com.cyr.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlFirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String n = req.getParameter("username");
		out.print("Welcome"+n);
		out.print("<a href='urlservlet2?uname="+n+"'>visit</a>");
		out.close();
		
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	}

}
