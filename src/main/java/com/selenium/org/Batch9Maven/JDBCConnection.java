package com.selenium.org.Batch9Maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection 
{

public String jdbcClass() throws ClassNotFoundException 
{
	String name = null;
	String email;
	try {
	
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root", "selenium");
		
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery("select * from persistent where firstname='Jeet1'");
		
		while(rs.next())
		{
			name=rs.getString("firstname");
			email=rs.getString("emailid");
			System.out.println(name+ " "+email);
		}
		
	}
	
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return name;
	
}
}
