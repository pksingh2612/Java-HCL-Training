package com.Week3_Day5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con=ConnectionUtil.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM employee");
			ResultSetMetaData rsmd=rs.getMetaData();
			int no_Of_Cols = rsmd.getColumnCount();
			System.out.println(no_Of_Cols);
			
			for(int i=1;i<=no_Of_Cols;i++) {
				String name= rsmd.getColumnName(i);
				String datatype = rsmd.getColumnTypeName(i);
				System.out.println(name+" "+datatype);
			}
			
			System.out.println(rsmd.getTableName(no_Of_Cols));
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
