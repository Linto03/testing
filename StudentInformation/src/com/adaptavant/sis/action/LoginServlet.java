package com.adaptavant.sis.action;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adaptavant.sis.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	LoginService loginservice = new LoginService();
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	//	PrintWriter out= response.getWriter();
	//	out.print("You are Entering into the login page");
		
		
		boolean status = loginservice.loginCheck(request, response);
		if (status == true) {
			request.setAttribute("newStudent",
					request.getParameter("studentName"));
			RequestDispatcher rd = request.getRequestDispatcher("jsp/Home.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("newStudent",
					"Please Check your User Name and Password");
			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/Error.jsp");
			rd.forward(request, response);
		}
	}
}
