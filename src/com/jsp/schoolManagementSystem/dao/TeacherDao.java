package com.jsp.schoolManagementSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.schoolManagementSystem.dto.Teacher;
import com.jsp.schoolManagementSystem.util.HelperClass;

public class TeacherDao {
	
	HelperClass helperClass = new HelperClass();
	Connection connection = helperClass.getConnection();
	
	public Teacher saveTeacher(Teacher teacher) {
		String query = "insert into teacher values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3,teacher.getEmail());
			
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
		return teacher;	
	}
	
	
	public boolean deleteTeacherById(int id) {
		String query = "delete from teacher where id = ?";
		
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
	
	
	public void getAllTeachers() {
		String query = "select * from teacher";
		
		try {
			
			//create statement
			PreparedStatement pst = connection.prepareStatement(query);
			
			//execute statement
			ResultSet rs = pst.executeQuery();
			
			System.out.println(rs);
			
			while(rs.next()) {
				System.out.println("============================================");
				System.out.println("Teacher id      :   " + rs.getInt(1));
				System.out.println("Teacher name    :   " + rs.getString(2));
				System.out.println("Teacher email   :   " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getTeacherById(int i) {
		String query = "select * from teacher where id = ?";
		
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
	
	
	public void updateTeacherById(int id , String name) {
		String query = "update teacher set name = ? where id = ?";
		
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



