package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");		
		ServletContext sc=getServletContext();
		Connection con=(Connection) sc.getAttribute("conn");
		Customer c=CustomerDAO.getuser(con,username,password);
				
			if(c!=null)
			{
				 System.out.println("valid"); 
				 request.setAttribute("errmsg","Valid user");
				 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");          
		         rd.forward(request, response);      
			}
			else
			{    System.out.println("invalid"); 
				 request.setAttribute("errmsg","Invalid user");
				 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");          
		         rd.forward(request, response);
			}		
	}
}
