package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.TeacherDao;

public class TeacherGetById {
	
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.getTeacherById(4);

	}
	
}
