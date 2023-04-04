package com.jsp.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student.dto.Student;
import com.jsp.student.util.HelperClass;

public class StudentDao {
	
	HelperClass helperClass = new HelperClass();
	Connection connection = helperClass.getConnection();
	
	public Student saveStudent(Student student) {
//		Connection connection = helperClass.getConnection();
		String query = "insert into student values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			
			preparedStatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return student;	
	}
	
	
	public boolean deleteStudentById(int id) {
//		Connection connection = helperClass.getConnection();
		String query = "delete from student where id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
		
	}
	
	
	public void getlAllStudents() {
//		Connection connection = helperClass.getConnection();
		String query = "select * from student";
		
		try {
			
			//create statement
			PreparedStatement pst = connection.prepareStatement(query);
			
			//execute statement
			ResultSet rs = pst.executeQuery();
			
			System.out.println(rs);
			
			while(rs.next()) {
				System.out.println("============================================");
				System.out.println("Student id      :   " + rs.getInt(1));
				System.out.println("Student name    :   " + rs.getString(2));
				System.out.println("Student email   :   " +rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getStudentById(int i) {
		String query = "select * from student where id = ?";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, i);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	public void updateStudentById(int id , String name) {
//		Connection connection = helperClass.getConnection();
		String query = "update student set email = ? where id = ?";
		
		try {
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, name);
			pst.setInt(2, id);
			int i =  pst.executeUpdate();
			if(i > 0)
				System.out.println("row updated sucessfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
