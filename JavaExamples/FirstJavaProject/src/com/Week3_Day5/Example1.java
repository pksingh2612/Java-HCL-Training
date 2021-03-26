package com.Week3_Day5;

import java.sql.Connection;
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
import java.util.Scanner;
import static java.lang.System.out;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("#######Employee Information########");
		int choice;
		do {
			out.println("1. Insert Employee");
			out.println("2. Update Employee");
			out.println("3. Delete Employee");
			out.println("4. Select Employee");
			out.println("5. Exit");
			out.println("Enter the choice");
			choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
				case 1:
					out.println("Enter Employee Name");
					String name=sc.nextLine();
					out.println("Enter Employee Age");
					int age=Integer.parseInt(sc.nextLine());
					out.println("Enter Employee Salary");
					double salary=Double.parseDouble(sc.nextLine());
					out.println("Enter Birthdate");
					String dob=sc.nextLine();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					Date date = null;
					try {
						date=sdf.parse(dob);
					}catch(ParseException e) {
						out.println(e);
					}
					Random r = new Random();
					int empid=r.nextInt(99999)+10000;
					Connection con=null;
					try {
						con=ConnectionUtil.getConnection();
						PreparedStatement ps =con.prepareStatement("INSERT INTO employee VALUES (?,?,?,?,?)");
						ps.setInt(1, empid);
						ps.setString(2,name);
						ps.setInt(3,age);
						ps.setDouble(4, salary);
						java.sql.Date birthDate=new java.sql.Date(date.getTime()); //coversion of date from java.util to java.sql
						ps.setDate(5, birthDate);
						int no_Of_Rows=ps.executeUpdate();
						if(no_Of_Rows==1) {
							out.println("Employee Record inserted Successfully");
						}
					}catch(Exception e) {
						out.println(e);
					}
					finally {
						if(con!=null) {
							try {
								con.close();
							} catch(SQLException e) {
								e.printStackTrace();
							}
						}
					}
					break;
				case 2:
					System.out.println("Enter employee id");
					int eid=Integer.parseInt(sc.nextLine());
					System.out.println("Enter new employee name");
					String ename=sc.nextLine();
					System.out.println("Enter new employee age");
					int eage=Integer.parseInt(sc.nextLine());
					System.out.println("Enter new employee salary");
					double sal=Double.parseDouble(sc.nextLine());
					Connection con1=null;
					try {
						con1=ConnectionUtil.getConnection();
						PreparedStatement ps1 = con1.prepareStatement("update employee set ename=?,age=?,salary=? where empid=?");
						ps1.setString(1, ename);
						ps1.setInt(2, eage);
						ps1.setDouble(3, sal);
						ps1.setInt(4, eid);
						int rows=ps1.executeUpdate();
						if(rows==1) {
							System.out.println("Employee record updated successfully");
						}
					}
					catch(Exception e) {
						System.out.println(e);
					}
					finally {
						if(con1!=null)
							try {
								con1.close();
							}
						catch(SQLException e) {
							e.printStackTrace();
						}
					}
					break;
				case 3:
					out.println("Enter employee id");
		              int emp_id=Integer.parseInt(sc.nextLine());
		              Connection con2=null;
		              try {
		                 con2=ConnectionUtil.getConnection();
		                 PreparedStatement ps2=con2.prepareStatement("delete from employee where empid=?");
		                 ps2.setInt(1, emp_id);
		                 int deletedRow=ps2.executeUpdate();
		                 if(deletedRow==1)
		                     System.out.println("Employee Record deleted successfully");
		              }
		              catch(Exception e) {
		                 
		              }
		              finally {
		                  if(con2!=null)
		                    try {
		                        con2.close();
		                    } catch (SQLException e) {
		                        e.printStackTrace();
		                    }
		              }
					break;
				case 4:
					Connection con3=null;
					try {
						con3=ConnectionUtil.getConnection();
						Statement st=con3.createStatement();
						ResultSet rs=st.executeQuery("SELECT * FROM employee");
						List<Employee> l = new ArrayList<>();
						while(rs.next()) {
							Employee emp = new Employee();
							emp.setEmpid(rs.getInt(1));
							emp.setEname(rs.getString(2));
							emp.setAge(rs.getInt(3));
							emp.setSalary(rs.getDouble(4));
							Date dob1= new Date(rs.getDate(5).getTime());
							emp.setDob(dob1);
							l.add(emp);
						}
						System.out.printf("%20s %30s %10s %15s %20s\n","EmployeeId","EmployeeName","Age","Salary","Date of Birth");
						
						for(Employee empl:l) {
							System.out.printf("%15s %20s %5s %10s %20s\n",empl.getEmpid(),empl.getEname(),empl.getAge(),empl.getSalary(),empl.getDob());
						}
					}
					catch(Exception e) {
						
					}
					finally {
						if(con3!=null) {
							try {
								con3.close();
							}catch(SQLException e) {
								
							}
						}
					}
					break;
				case 5:
					System.exit(0);
					break;
			}
		}while(choice<5);

	}

}

//
//mysql> create database jdbc;
//Query OK, 1 row affected (0.41 sec)
//
//mysql> use jdbc;
//Database changed
//mysql> create table employee(empid int primary key,ename varchar(20),age int,salary double,dob date);
//Query OK, 0 rows affected (0.49 sec)
//
//mysql> DESCRIBE handson.employee;
//ERROR 1146 (42S02): Table 'handson.employee' doesn't exist
//mysql> DESCRIBE jdbc.employee;
//+--------+-------------+------+-----+---------+-------+
//| Field  | Type        | Null | Key | Default | Extra |
//+--------+-------------+------+-----+---------+-------+
//| empid  | int         | NO   | PRI | NULL    |       |
//| ename  | varchar(20) | YES  |     | NULL    |       |
//| age    | int         | YES  |     | NULL    |       |
//| salary | double      | YES  |     | NULL    |       |
//| dob    | date        | YES  |     | NULL    |       |
//+--------+-------------+------+-----+---------+-------+
//5 rows in set (0.09 sec)
//
//mysql> select * from employee;
//+-------+--------------+------+--------+------------+
//| empid | ename        | age  | salary | dob        |
//+-------+--------------+------+--------+------------+
//| 34456 | Anshul Gupta |   22 |  23000 | 1999-08-31 |
//+-------+--------------+------+--------+------------+
//1 row in set (0.01 sec)
//
//mysql> select * from employee;
//+-------+----------------+------+--------+------------+
//| empid | ename          | age  | salary | dob        |
//+-------+----------------+------+--------+------------+
//| 34456 | Anshul Gupta   |   22 |  23000 | 1999-08-31 |
//| 53850 | Rishav Anurag  |   23 |  30000 | 1998-02-07 |
//| 55324 | Sidhhath Singh |   24 |  22000 | 1996-10-28 |
//+-------+----------------+------+--------+------------+
//3 rows in set (0.00 sec)

//2. +-------+----------------+------+--------+------------+
//| empid | ename          | age  | salary | dob        |
//+-------+----------------+------+--------+------------+
//| 34456 | Anshul         |   20 |  20000 | 1999-08-31 |
//| 53850 | Rishav Anurag  |   23 |  30000 | 1998-02-07 |
//| 55324 | Sidhhath Singh |   24 |  22000 | 1996-10-28 |
//+-------+----------------+------+--------+------------+
