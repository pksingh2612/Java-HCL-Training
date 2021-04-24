package com.handsonWeek5Day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Week5_Day3.Employee;
import com.handsonWeek5Day1.ConnectionUtil;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
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
		int empId=Integer.parseInt(request.getParameter("empId"));
		
		Connection con=null;
		try {
			con=ConnectionUtil.getConnection();
			Statement st=con.createStatement();
			String sqlQuery = "SELECT * FROM employee WHERE EmpId="+empId;
			ResultSet rs=st.executeQuery(sqlQuery);
			System.out.println(rs);
			List<Employee1> l = new ArrayList<>();
			while(rs.next()) {
				Employee1 emp = new Employee1();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				emp.setGender(rs.getString(4));
				emp.setDeptname(rs.getString(5));
				emp.setBasic(rs.getInt(6));
				emp.setGrade(rs.getString(7));
				l.add(emp);
			}
			//System.out.println(l);
			if(l.isEmpty())
			{
				RequestDispatcher rd= request.getRequestDispatcher("/EmployeeErrorPage.jsp");
				 rd.forward(request, response);
			}
			else {
				request.setAttribute("empList", l);
				RequestDispatcher rd= request.getRequestDispatcher("/RegisteredUser.jsp");
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
