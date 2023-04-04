package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.TeacherDao;

public class TeacherUpdate {
	public static void main(String[] args) {
		TeacherDao teacher = new TeacherDao();
		teacher.updateTeacherById(4, "Nihal");
	}
	
	
}
