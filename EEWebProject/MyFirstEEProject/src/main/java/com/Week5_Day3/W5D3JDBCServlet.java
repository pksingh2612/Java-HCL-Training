package com.Week5_Day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class W5D3JDBCServlet
 */
@WebServlet("/W5D3JDBCServlet")
public class W5D3JDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public W5D3JDBCServlet() {
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
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		double salary=Double.parseDouble(request.getParameter("salary"));
		String dept=request.getParameter("dept");
		String gender=request.getParameter("gender");
		String doj=request.getParameter("doj");
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date date_join=null;
		
		try {
			date_join = sdf.parse(doj);
		}catch(ParseException e) {
			System.out.println(e);
		}
		Random r = new Random();
		int empid=r.nextInt(99999)+10000;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
			PreparedStatement ps =con.prepareStatement("INSERT INTO employee123 VALUES (?,?,?,?,?,?,?)");
			ps.setInt(1, empid);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.setDouble(4, salary);
			ps.setString(5,dept);
			ps.setString(6,gender);
			java.sql.Date joinDate=new java.sql.Date(date_join.getTime()); //coversion of date from java.util to java.sql
			ps.setDate(7, joinDate);
			int no_Of_Rows=ps.executeUpdate();
			if(no_Of_Rows!=0) {
//								
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("SELECT * FROM employee123");
				List<Employee> l = new ArrayList<>();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmpid(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setAge(rs.getInt(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDept(rs.getString(5));
					emp.setGender(rs.getString(6));
					Date dob1= new Date(rs.getDate(7).getTime());
					emp.setDoj(dob1);
					l.add(emp);
				}
				if(l!=null)
				{
					request.setAttribute("empList", l);
					RequestDispatcher rd= request.getRequestDispatcher("/W5D3Success.jsp");
					rd.forward(request, response);
				}
			}
		}catch(Exception e) {
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

//
//mysql> show databases;
//+--------------------+
//| Database           |
//+--------------------+
//| handson            |
//| information_schema |
//| jdbc               |
//| journal            |
//| mysql              |
//| performance_schema |
//| sys                |
//+--------------------+
//7 rows in set (0.04 sec)
//
//mysql> use jdbc;
//Database changed
//mysql> show tables;
//+----------------+
//| Tables_in_jdbc |
//+----------------+
//| employee       |
//| product        |
//| student        |
//+----------------+
//3 rows in set (0.03 sec)
//
//mysql> create table employee123(empid int primary key,name varchar(20),age int, salary double, dept varchar(20),gender varchar(20),doj date);
//Query OK, 0 rows affected (0.12 sec)
//
//mysql> describe jdbc.employee123
//    -> describe jdbc.employee123;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'describe jdbc.employee123' at line 2
//mysql> describe jdbc.employee123;
//+--------+-------------+------+-----+---------+-------+
//| Field  | Type        | Null | Key | Default | Extra |
//+--------+-------------+------+-----+---------+-------+
//| empid  | int         | NO   | PRI | NULL    |       |
//| name   | varchar(20) | YES  |     | NULL    |       |
//| age    | int         | YES  |     | NULL    |       |
//| salary | double      | YES  |     | NULL    |       |
//| dept   | varchar(20) | YES  |     | NULL    |       |
//| gender | varchar(20) | YES  |     | NULL    |       |
//| doj    | date        | YES  |     | NULL    |       |
//+--------+-------------+------+-----+---------+-------+
//7 rows in set (0.01 sec)
//
//mysql> select * from employee123;
//Empty set (0.01 sec)
//
//mysql> select * from employee123;
//+--------+-----------------+------+--------+-------------+--------+------------+
//| empid  | name            | age  | salary | dept        | gender | doj        |
//+--------+-----------------+------+--------+-------------+--------+------------+
//| 100899 | Prabhakar Singh |   23 |  21500 | Development | male   | 2021-02-02 |
//+--------+-----------------+------+--------+-------------+--------+------------+
//1 row in set (0.00 sec)
