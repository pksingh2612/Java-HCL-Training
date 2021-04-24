package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
 		PrintWriter pw= response.getWriter(); 
		String loginID=request.getParameter("loginId");
	     String password=request.getParameter("password");
	     if(loginID.equals("admin") && password.equals("abcd1234")) {
	 		RequestDispatcher rd=request.getRequestDispatcher("SuccessPage.html");
	 		rd.forward(request, response);
	     }
	     else {
	 		RequestDispatcher rd=request.getRequestDispatcher("ErrorPage.html");
	 		rd.forward(request, response);
	     }
	}

}
