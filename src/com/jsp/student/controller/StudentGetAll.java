package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class StudentGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao student = new StudentDao();
		
		student.getlAllStudents();

	}

}
