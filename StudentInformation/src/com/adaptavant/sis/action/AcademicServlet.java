package com.adaptavant.sis.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adaptavant.sis.service.AcademicService;

public class AcademicServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AcademicService academicservice = new AcademicService();

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.print("Your are entering into the mark calculate function");
		academicservice.markCalculate(request, response);
		// boolean markstatus = academicservice.markCalculate(request,
		// response);
		// if (markstatus == true) {
		// request.setAttribute("newStudent",
		// request.getParameter("userName"));
		// RequestDispatcher rd =
		// request.getRequestDispatcher("jsp/Home.jsp");
		// rd.forward(request, response);
		// } else {
		// request.setAttribute("newStudent",
		// "Please Check your User Name and Password");
		// RequestDispatcher rd = request
		// .getRequestDispatcher("jsp/Error.jsp");
		// rd.forward(request, response);
		// }
	}
}
