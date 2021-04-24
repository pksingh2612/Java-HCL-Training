package com.handsonWeek5Day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Problem11Servlet
 */
@WebServlet("/Problem11Servlet")
public class Problem11Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Problem11Servlet() {
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
		String name=request.getParameter("username");
		
		Connection con=null;
		try {
			con=ConnectionUtil.getConnection();
			Statement st=con.createStatement();
			String sqlQuery = "SELECT age FROM user WHERE name='"+name+"'";
			ResultSet rs=st.executeQuery(sqlQuery);
			List<User> l = new ArrayList<>();
			while(rs.next()) {
				User user = new User();
//				user.setUserid(rs.getInt(1));
//				user.setName(rs.getString(2));
//				user.setAge(rs.getInt(3));
				user.setAge(rs.getInt(1));
				l.add(user);
			}
			if(l!=null)
			{
				request.setAttribute("userList", l);
				RequestDispatcher rd= request.getRequestDispatcher("/Problem11b.jsp");
				rd.forward(request, response);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
