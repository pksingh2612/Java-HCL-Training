package com.handsomWeek_3_Day_5;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("#######Product Information########");
		int choice;
		do {
			out.println("1. Insert Product");
			out.println("2. Update Product");
			out.println("3. Delete Product");
			out.println("4. Select Product");
			out.println("5. Exit");
			out.println("Enter the choice");
			choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
				case 1:
					out.println("Enter Product Name");
					String pName=sc.nextLine();
					out.println("Enter Product Brand");
					String pBrand=sc.nextLine();
					out.println("Enter Product Quantity");
					int pQuantity=Integer.parseInt(sc.nextLine());
					out.println("Enter Product Price");
					double pPrice=Double.parseDouble(sc.nextLine());
					Random r = new Random();
					int pId=r.nextInt(99999)+10000;
					Connection con=null;
					try {
						con=ConnectionUtil.getConnection();
						PreparedStatement ps =con.prepareStatement("INSERT INTO product VALUES (?,?,?,?,?)");
						ps.setInt(1, pId);
						ps.setString(2,pName);
						ps.setString(3,pBrand);
						ps.setInt(4,pQuantity);
						ps.setDouble(5, pPrice);
						int no_Of_Rows=ps.executeUpdate();
						if(no_Of_Rows==1) {
							out.println("Product Record inserted Successfully");
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
					out.println("Enter Product Id :");
					int upId=Integer.parseInt(sc.nextLine());
					out.println("Enter Product Name :");
					String upName=sc.nextLine();
					out.println("Enter Product Brand :");
					String upBrand=sc.nextLine();
					out.println("Enter Product Quantity :");
					int upQuantity=Integer.parseInt(sc.nextLine());
					out.println("Enter Product Price :");
					double upPrice=Double.parseDouble(sc.nextLine());
					Connection con1=null;
					try {
						con1=ConnectionUtil.getConnection();
						PreparedStatement ps1 = con1.prepareStatement("update product set PName=?,PBrand=?,PQuantity=?,PPrice=? where PID=?");
						ps1.setString(1, upName);
						ps1.setString(2, upBrand);
						ps1.setInt(3, upQuantity);
						ps1.setDouble(4, upPrice);
						ps1.setInt(5, upId);
						int rows=ps1.executeUpdate();
						if(rows==1) {
							System.out.println("Product record updated successfully");
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
					out.println("Enter Product Id :");
		              int dpId=Integer.parseInt(sc.nextLine());
		              Connection con2=null;
		              try {
		                 con2=ConnectionUtil.getConnection();
		                 PreparedStatement ps2=con2.prepareStatement("delete from PRODUCT where PID=?");
		                 ps2.setInt(1, dpId);
		                 int deletedRow=ps2.executeUpdate();
		                 if(deletedRow==1)
		                     System.out.println("Product Record deleted successfully");
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
						ResultSet rs=st.executeQuery("SELECT * FROM product");
						List<Product> l = new ArrayList<>();
						while(rs.next()) {
							Product product = new Product();
							product.setPid(rs.getInt(1));
							product.setPname(rs.getString(2));
							product.setPbrand(rs.getString(3));
							product.setPquantity(rs.getInt(4));
							product.setPprice(rs.getDouble(5));
							l.add(product);
						}
						System.out.printf("%20s %30s %10s %15s %20s\n","PID","PNAME","PBRAND","PQUANTITY","PPRICE");
						
						for(Product prod:l) {
							System.out.printf("%15s %20s %5s %10s %20s\n",prod.getPid(),prod.getPname(),prod.getPbrand(),prod.getPbrand(),prod.getPprice());
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
