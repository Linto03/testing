package com.adaptavant.sis.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.adaptavant.sis.bean.StudentBean;

public class LoginService {
	public boolean loginCheck(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String studentName = request.getParameter("studentName");
		String studentPassword = request.getParameter("pwd");
		boolean value = false;
		try {
			PersistenceManager PM = JDOHelper.getPersistenceManagerFactory(
					"transactions-optional").getPersistenceManager();
			Query q = PM.newQuery(StudentBean.class);
			@SuppressWarnings("unchecked")
			List<StudentBean> list = (List<StudentBean>) q.execute();
			for (StudentBean r : list) {
				if (r.getStudentName().equals(studentName)
						&& r.getStudentPassword().equals(studentPassword))
					value = true;
			}
		} catch (Exception e) {
			out.print("Please Enter a valid details");
		}
		return value;
	}
}
