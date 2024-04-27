package com.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entiry.EntityClass;

public class MainClass 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext();
		config.scan("com.*");
		config.refresh();
		
		
		EntityClass e=new EntityClass();
		e.setUserId(3);
		e.setUserName("mahadev");
		e.setOrderAmount(121212.0);
//		
//		EntityClass e1=new EntityClass();
//		e1.setUserId(4);
//		e1.setUserName("Prahsant");
//		e1.setOrderAmount(5050.0);
//		
//		EntityClass e2=new EntityClass();
//		e2.setUserId(5);
//		e2.setUserName("sonam bajwa");
//		e2.setOrderAmount(8979.0);
//		
//		EntityClass e4=new EntityClass();
//		e4.setUserId(6);
//		e4.setUserName("Kajal");
//		e4.setOrderAmount(5656.0);
//		
		
		
		
		
		
		Dboperation bean = config.getBean(Dboperation.class);
		
		//bean.deletData(e);
		
		//bean.addData(e);
		
		//bean.deletAlldata();
		
		//bean.addListofObjects(Arrays.asList(e,e1,e2,e4));
		
		//Updating record
		//bean.updateData(e);
		
		//Find by that to find using only primer key
		//bean.findByid(3);
		
		bean.findByOrder(1000.0);
		
		
	}

}
