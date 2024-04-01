package com.cyr.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesSecondExample extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Cookie ck[]=  req.getCookies();
		out.print("Hello"+ck[0].getValue());
		out.close();
		
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	}

}