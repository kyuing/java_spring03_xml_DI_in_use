package com.javalec.studentEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		/* the instance studentInfo and student2 are both based on ctx */
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);	//container

		
		
		//way 1: xml DI 
                                                      /*id (instance), parent class*/
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		studentInfo.getStudentInfo();

		//way 2: xml + java DI (with no annotation)
		Student student2 = ctx.getBean("student2", Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		ctx.close();	//close ctx
	}

}
