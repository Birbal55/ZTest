package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;
import java.sql.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	//Life cycle methods:
	
	ServletConfig conf;
	
	public void init(ServletConfig conf)
	{
		this.conf = conf;
		System.out.println("Creating object:.....");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing...........");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my output from servlet method:</h1>");
		out.println("<h1>Todays date and time is " + new Date(0).toString()+"</h1>");
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("going to destroy servlet object...");
	}

	//non-life cycle methods
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet is created by Birbal Kumar";
	}

	

	
}
