package com.Week3_Day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) {
		Connection con =null;
		try {
			con=ConnectionUtil.getConnection();
			Statement st= con.createStatement();
			st.addBatch("insert into student values(4,'Sita',24)");
			st.addBatch("insert into student values(5,'Rita',25)");
			st.addBatch("insert into student values(6,'Gita',26)");
			
			int a[] = st.executeBatch();
			System.out.println(a);
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

//> create table student(stuid int primary key,sname varchar(20),sage int);

//+-------+-------------+------+-----+---------+-------+
//| Field | Type        | Null | Key | Default | Extra |
//+-------+-------------+------+-----+---------+-------+
//| stuid | int         | NO   | PRI | NULL    |       |
//| sname | varchar(20) | YES  |     | NULL    |       |
//| sage  | int         | YES  |     | NULL    |       |
//+-------+-------------+------+-----+---------+-------+

//Output of above program

//+-------+-------+------+
//| stuid | sname | sage |
//+-------+-------+------+
//|     1 | Ram   |   20 |
//|     2 | Sam   |   21 |
//|     3 | Raj   |   22 |
//+-------+-------+------+
