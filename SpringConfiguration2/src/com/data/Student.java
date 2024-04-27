package com.data;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private int studentID;
	private String studentName;
	
	public Student() {
		System.out.println("Student object is crated");
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
