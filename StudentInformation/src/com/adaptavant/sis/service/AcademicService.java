package com.adaptavant.sis.service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.adaptavant.sis.bean.MarkBean;
public class AcademicService {
	MarkBean markbean = new MarkBean();
	boolean value = false;
	int total=0, maxtotal=0;
	int pecentage=0;
	String grade;
	double pec=0;

	public void markCalculate(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("You are in processing");
		
		int subject1 = Integer.parseInt(request.getParameter("sub1"));
		int subject2 = Integer.parseInt(request.getParameter("sub2"));
		int subject3 = Integer.parseInt(request.getParameter("sub3"));
		int subject4 = Integer.parseInt(request.getParameter("sub4"));
		int subject5 = Integer.parseInt(request.getParameter("sub5"));

		int maxMarkSub1 = Integer.parseInt(request.getParameter("max1"));
		int maxMarkSub2 = Integer.parseInt(request.getParameter("max2"));
		int maxMarkSub3 = Integer.parseInt(request.getParameter("max3"));
		int maxMarkSub4 = Integer.parseInt(request.getParameter("max4"));
		int maxMarkSub5 = Integer.parseInt(request.getParameter("max5"));

		total = subject1 + subject2 + subject3 + subject4 + subject5;
		maxtotal = maxMarkSub1 + maxMarkSub2 + maxMarkSub3 + maxMarkSub4
				+ maxMarkSub5;
		pec=((double)total / maxtotal)*100;
			
		if(pec > 90)
			grade="A";
		else if (pec < 89 && pec > 75 )
			grade="B";
		else if (pec < 74 && pec > 65)
			grade="C";
		else if (pec <64 && pec > 50)
				grade="D";
		else 
			grade="F";
		try {
			markbean.setSub1(subject1);
			markbean.setSub2(subject2);
			markbean.setSub3(subject3);
			markbean.setSub4(subject4);
			markbean.setSub5(subject5);
			markbean.setMaxMarkSub1(maxMarkSub1);
			markbean.setMaxMarkSub2(maxMarkSub2);
			markbean.setMaxMarkSub3(maxMarkSub3);
			markbean.setMaxMarkSub4(maxMarkSub4);
			markbean.setMaxMarkSub5(maxMarkSub5);
			markbean.setMaxTotal(maxtotal);
			markbean.settotal(total);		
			markbean.setGrade(grade);
			PersistenceManager PM = JDOHelper.getPersistenceManagerFactory(
					"transactions-optional").getPersistenceManager();
			PM.makePersistent(markbean);
			out.print("Processing Completed");
			out.println(grade);
			// value = true;
		} catch (Exception e) {
			out.println(e);
		}
		// return value;
	}
}
