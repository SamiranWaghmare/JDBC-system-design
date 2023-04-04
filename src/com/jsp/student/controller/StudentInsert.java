package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class StudentInsert {

	public static void main(String[] args) {
		Student  s1 = new Student();
		s1.setId(5);
		s1.setName("Gopu");
		s1.setEmail("gopu@mail.com");
		
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.saveStudent(s1);
		if(student != null) {
			System.out.print("Student " + student.getName() + " saved scucessfully");
		}
		
	}

}
