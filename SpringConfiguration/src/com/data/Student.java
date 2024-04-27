package com.data;

public class Student {

	private String StudentName;
	private int StudentId;
	private String Gender;
	
	public Student()
	{
		System.out.println("Student object created");
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentId=" + StudentId + ", Gender=" + Gender + "]";
	}
	
	
	
}
