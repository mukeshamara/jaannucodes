package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
	
public static Customer getuser(Connection con,String username,String password)
{
	String query="select * from userdetails where username=? and password=?";
	ResultSet rs=null;
	Customer customer=null;
	try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,username);
		ps.setString(2,password);
		rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\n"+rs.getString(2));
			username=rs.getString(1);
			password=rs.getString(2);
			customer=new Customer(username, password);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return customer;
}
}
