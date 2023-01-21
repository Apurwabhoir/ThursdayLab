package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Create_demo {
	
	public void Create_database()
	{
	try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "root");
			Statement st=con.createStatement();
			
			System.out.println("For Creating Database ");
			String sql = "CREATE DATABASE StudentDetails";
	        st.executeUpdate(sql);
	        System.out.println("Database created successfully...");   
	
			con.close();
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public void Create_table()
	{
	try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root", "root");
			Statement st=con.createStatement();
			
			System.out.println("For Creating table ");
			String sql = "Create table Student_D(student_id int(3) primary key, fName varchar(200),"
					+ " lName varchar(200), DOB date,city varchar(300), age int, phone_no int(200))";
	        st.executeUpdate(sql);
	        System.out.println("table created successfully...");   
	
			con.close();
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	
}