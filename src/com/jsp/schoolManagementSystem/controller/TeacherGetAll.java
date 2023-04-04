package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.TeacherDao;

public class TeacherGetAll {

	public static void main(String[] args) {
		TeacherDao teacher = new TeacherDao();
		
		teacher.getAllTeachers();

	}

}
