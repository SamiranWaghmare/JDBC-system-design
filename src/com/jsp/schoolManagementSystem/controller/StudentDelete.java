package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.StudentDao;

public class StudentDelete {
	public static void main(String[] args) {
		
		StudentDao student = new StudentDao();
		boolean flag = student.deleteStudentById(1);
		
		if(flag)
			System.out.println("student deleted suceccfully");
		else
			System.out.println("could not delete student");
		
		
	}

}
