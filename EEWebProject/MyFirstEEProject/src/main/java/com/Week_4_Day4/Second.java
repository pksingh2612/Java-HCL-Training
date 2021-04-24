package com.Week_4_Day4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
//@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");

         PrintWriter pw=response.getWriter();

         String name=request.getParameter("n1");

         pw.println(name+"<br/>");

         int age=Integer.parseInt(request.getParameter("n2"));

         pw.println(age+"<br/>");

         double sal=Double.parseDouble(request.getParameter("n3"));

         pw.println(sal+"<br/>");

         String gen=request.getParameter("gen");

         pw.println(gen+"<br/>");

         String[] hob=request.getParameterValues("hobby");

         for(String str:hob)

                         pw.println(str+"<br/>");

         pw.println(request.getProtocol()+"<br/>");

         pw.println(request.getScheme()+"<br/>");

         pw.println(request.getRemoteAddr()+"<br/>");

         pw.println(request.getServerName()+"<br/>");

         pw.println(request.getServerPort()+"<br/>");

         pw.println(request.getContextPath()+"<br/>");

         pw.println(request.getServletPath()+"<br/>");

         pw.println(request.getQueryString()+"<br/>");

         pw.println(request.getRequestURI()+"<br/>");

         pw.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        PrintWriter pw=response.getWriter();

        pw.println("Is post method"+"<br/>");

        String name=request.getParameter("n1");

        pw.println(name+"<br/>");

        int age=Integer.parseInt(request.getParameter("n2"));

        pw.println(age+"<br/>");

        double sal=Double.parseDouble(request.getParameter("n3"));

        pw.println(sal+"<br/>");

        String gen=request.getParameter("gen");

        pw.println(gen+"<br/>");

        String[] hob=request.getParameterValues("hobby");

        for(String str:hob)

                        pw.println(str+"<br/>");

        pw.println("Using Enumeration"+"<br/>");

        Enumeration e =request.getParameterNames();

        while(e.hasMoreElements()){

                           String s1=(String)e.nextElement();

                           String s2=request.getParameter(s1);

                           pw.println(s1+"="+s2+"<br/>");

        }

        pw.close();
	}

}
