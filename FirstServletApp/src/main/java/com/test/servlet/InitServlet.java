package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		 res.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = res.getWriter();
	      out.println("<h1>" + "Welcome to WebApplication" + "</h1>");
	   
	}

}
