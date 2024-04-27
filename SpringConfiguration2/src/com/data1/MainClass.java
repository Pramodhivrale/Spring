package com.data1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.data.Product;
import com.data.Student;



public class MainClass 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
    			new AnnotationConfigApplicationContext();
		
		context.scan("com.data");
		context.refresh();
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		
		Product product = context.getBean(Product.class);
		System.out.println(product);
	}

}
