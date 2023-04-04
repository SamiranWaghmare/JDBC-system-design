package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class StudentUpdate {

	public static void main(String[] args) {
		
		StudentDao student = new StudentDao();
		student.updateStudentById(1,"motii@mail.com");

	}

}
