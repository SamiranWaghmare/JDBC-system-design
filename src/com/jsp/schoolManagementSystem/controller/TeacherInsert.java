package com.jsp.schoolManagementSystem.controller;
import com.jsp.schoolManagementSystem.dao.TeacherDao;
import com.jsp.schoolManagementSystem.dto.Teacher;

public class TeacherInsert {

	public static void main(String[] args) {
		Teacher  t1 = new Teacher();
		t1.setId(6);
		t1.setName("Prajval");
		t1.setEmail("prajval@mail.com");
		
		TeacherDao teacherDao = new TeacherDao();
		Teacher teacher = teacherDao.saveTeacher(t1);
		if(teacher != null) {
			System.out.print("Teacher " + teacher.getName() + " saved scucessfully");
		}
		
	}

}
