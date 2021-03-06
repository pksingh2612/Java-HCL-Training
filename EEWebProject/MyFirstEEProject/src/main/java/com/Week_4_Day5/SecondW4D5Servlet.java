package com.Week_4_Day5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondW4D5Servlet
 */
@WebServlet("/SecondW4D5Servlet")
public class SecondW4D5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondW4D5Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
         PrintWriter pw=response.getWriter();
         HttpSession hs=request.getSession();
         pw.println(hs.getId()+"<br/>");
         pw.println(hs.getCreationTime()+"<br/>");
         pw.println(hs.getLastAccessedTime()+"<br/>");
         pw.println(hs.isNew()+"<br/>");
         hs.setAttribute("favColor","blue");
         pw.println("<a href='/MyFirstEEProject/ThirdW4D5Servlet'>Click here</a>");
         pw.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
