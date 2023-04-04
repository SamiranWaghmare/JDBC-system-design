package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.StudentDao;

public class StudentGetById {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.getStudentById(4);

	}

}
