package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.StudentDao;

public class StudentGetAll {

	public static void main(String[] args) {
		StudentDao student = new StudentDao();
		
		student.getlAllStudents();

	}

}
