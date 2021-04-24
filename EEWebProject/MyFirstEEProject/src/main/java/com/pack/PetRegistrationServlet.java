package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PetRegistrationServlet
 */
@WebServlet("/PetRegistrationServlet")
public class PetRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetRegistrationServlet() {
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
		
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String address=request.getParameter("address");
        String email=request.getParameter("email");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        String petName=request.getParameter("petName");
        String phoneNumber=request.getParameter("phoneNumber");
        String petType=request.getParameter("petType");
        int petAge=Integer.parseInt(request.getParameter("petAge"));
        
        System.out.println("First Name :"+firstName);
        System.out.println("Last Name :"+lastName);
        System.out.println("Address :"+address);
        System.out.println("Email :"+email);
        System.out.println("City :"+city);
        System.out.println("State :"+state);
        System.out.println("Pet Name :"+petName);
        System.out.println("Phone Number :"+phoneNumber);
        System.out.println("Pet Type:"+petType);
        System.out.println("Pet Age:"+petAge);
        
	}

}
