package com.javalec.studentEx;

public class Student {
	
	private String name;
	private String age;
	private String grade;
	private String major;

	public Student(String name, String age, String grade, String major) {
		//a specified constructor for student information
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.major = major;
	}
	
	//we don't need setters since we are using a specified constructor
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}
	
}
