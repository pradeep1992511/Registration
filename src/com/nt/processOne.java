package com.nt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class processOne
 */
@WebServlet("/processOne")
public class processOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   String name= request.getParameter("name");
	   String address= request.getParameter("address");
	   String phone= request.getParameter("phone");
	   String city= request.getParameter("city");
	   
	   System.out.println("Name is:"+name);
	   System.out.println("Address is:"+address);
	   System.out.println("phone is:"+phone);
	   System.out.println("city is:"+city)
	   ;
	   request.getSession().setAttribute("name", name);
	   request.getSession().setAttribute("address", address);
	   request.getSession().setAttribute("phone", phone);
	   request.getSession().setAttribute("city", city);
	   
	   response.sendRedirect("html/pageTwo.html");
	}

}
