package com.data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass 
{
    public static void main(String[] args) {
		
    	
    	AnnotationConfigApplicationContext context=
    			new AnnotationConfigApplicationContext(ConfigClass.class);
    	Object bean = context.getBean("student");
    	System.out.println(bean);
    	
    	Object bean2 = context.getBean("student");
    	System.out.println(bean2);
    	
    	Object bean3 = context.getBean("stu");
    	System.out.println(bean3);
    	
	}

}
