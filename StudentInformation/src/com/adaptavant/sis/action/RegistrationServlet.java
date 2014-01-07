package com.adaptavant.sis.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adaptavant.sis.service.RegistrationService;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegistrationService registrationservice = new RegistrationService();

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Boolean regStatus=registrationservice.insert(request, response);
		if (regStatus == true) {
			request.setAttribute("newStudent",
					request.getParameter("userName"));
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
