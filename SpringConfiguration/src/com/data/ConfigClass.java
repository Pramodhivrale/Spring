package com.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

	@Bean(name = "student")
	public Student student1() 
	{
		return new Student();
		
	}
	
	@Bean(name = "stu")
	public Student getstudent()
	{
		Student s=new Student();
		s.setStudentName("Rutu");
		s.setStudentId(1);
		s.setGender("female");
		return s;
	}
}
