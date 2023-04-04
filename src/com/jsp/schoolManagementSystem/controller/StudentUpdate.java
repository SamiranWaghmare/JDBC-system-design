package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.StudentDao;

public class StudentUpdate {

	public static void main(String[] args) {
		
		StudentDao student = new StudentDao();
		student.updateStudentById(1,"mahon");

	}

}
