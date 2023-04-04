package com.jsp.schoolManagementSystem.controller;

import com.jsp.schoolManagementSystem.dao.TeacherDao;

public class TeacherDelete {
	public static void main(String[] args) {
		TeacherDao teacher = new TeacherDao();
		 boolean flag = teacher.deleteTeacherById(5);
		 if(flag)
			 System.out.println("row sucessfully deleted");
	}
}
