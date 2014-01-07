package com.adaptavant.sis.bean;

import java.io.Serializable;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class StudentBean implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private String StudentId;
	@Persistent
	private String StudentName;
	@Persistent
	private String StudentPassword;
	@Persistent
	private String StudentSurName;
	@Persistent
	private String StudentDob;
	@Persistent
	private String StudentEmail;
	@Persistent
	private String StudentPhone;
	@Persistent
	private String StudentAddress;

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentPassword() {
		return StudentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		StudentPassword = studentPassword;
	}

	public String getStudentSurName() {
		return StudentSurName;
	}

	public void setStudentSurName(String studentSurName) {
		StudentSurName = studentSurName;
	}

	public String getStudentDob() {
		return StudentDob;
	}

	public void setStudentDob(String studentDob) {
		StudentDob = studentDob;
	}

	public String getStudentEmail() {
		return StudentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
}
