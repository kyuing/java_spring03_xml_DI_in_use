package com.javalec.studentEx;

public class StudentInfo {
	
	//the class Student is instantiated.
	//the variable student will have a specified class information from the class Student
	private Student student;	

	public StudentInfo(Student student) {
		//a specified constructor to pick a new student class instantiated.
		this.student = student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		
		if (student != null) {
			
			System.out.println("Name: " + student.getName());
			System.out.println("Age: " + student.getAge());
			System.out.println("Grade: " + student.getGrade());
			System.out.println("Major: " + student.getMajor());
			System.out.println("======================================");
		}
	}

}
