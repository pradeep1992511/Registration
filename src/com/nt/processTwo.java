package com.nt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class processTwo
 */
@WebServlet("/processTwo")
public class processTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  String id= request.getParameter("id");
	  String course=request.getParameter("course");
	  String institute= request.getParameter("institute");
	  
	  System.out.println("id is:"+id);
	  System.out.println("course is:"+course);
	  System.out.println("institute is:"+institute);
	  
	  request.getSession().setAttribute("id", id);
	  request.getSession().setAttribute("course", course);
	  request.getSession().setAttribute("institute", institute);
	  
	  response.sendRedirect("html/pageThree.html");
	}

}
