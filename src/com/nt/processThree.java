package com.nt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class processThree
 */
@WebServlet("/processThree")
public class processThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   String cid= request.getParameter("cid");
	 String designation=request.getParameter("designation");
	 String company= request.getParameter("company");
	 
	 System.out.println("cid is:"+cid);
	 System.out.println("designation is:"+designation);
	 System.out.println("company is:"+company);
	 
	 request.getSession().setAttribute("cid", cid);
	 request.getSession().setAttribute("designation", designation);
	 request.getSession().setAttribute("company", company);
	 
	 response.sendRedirect("jsp/printOut.jsp");
	}

}
