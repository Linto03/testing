package com.adaptavant.sis.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adaptavant.sis.bean.StudentBean;

public class RegistrationService {
	public Boolean insert(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		Boolean value=false;
		StudentBean studentBean = new StudentBean();
		PrintWriter out = response.getWriter();
		String newStudentId = request.getParameter("studentId");
		String newUserName = request.getParameter("userName");
		String newPassword = request.getParameter("pwd");
		String newSurName = request.getParameter("surName");
		String newDob = request.getParameter("dob");
		String newEmail = request.getParameter("email");
		String newPhone = request.getParameter("phone");
		String newAddress = request.getParameter("address");
		
		studentBean.setStudentId(newStudentId);
		studentBean.setStudentName(newUserName);
		studentBean.setStudentPassword(newPassword);
		studentBean.setStudentSurName(newSurName);
		studentBean.setStudentDob(newDob);
		studentBean.setStudentEmail(newEmail);
		studentBean.setStudentPhone(newPhone);
		studentBean.setStudentAddress(newAddress);
		try {
			PersistenceManager PM = JDOHelper.getPersistenceManagerFactory(
					"transactions-optional").getPersistenceManager();
			PM.makePersistent(studentBean);
			value = true;
			} catch (Exception e) {
			out.println(e);
			}
		return value;
	}
}
