package com.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entiry.EntityClass;
import com.jpa.JpaRepo;
@Component
public class Dboperation 
{
	@Autowired
	private JpaRepo jpaRepo;
	
	public void addData(EntityClass entityClass)
	{
		jpaRepo.save(entityClass);
		System.out.println("Data Added succesfully...");
	}
	public void deletData(EntityClass entityClass)
	{
		jpaRepo.delete(entityClass);
		System.out.println("Deleted Succesfully...");
	}
	
	public void deletAlldata()
	{
		jpaRepo.deleteAll();
		System.out.println("All data deleted");
	}
	
	public void addListofObjects(List<EntityClass> list)
	{
	     jpaRepo.saveAll(list);
	     System.out.println("List of objects saved...");
	}
	
	public void updateData(EntityClass entityClass) {
		jpaRepo.save(entityClass);
	}
	
	public void findByid(int id)
	{
		Optional<EntityClass> optional = jpaRepo.findById(id);
		System.out.println(optional);
		System.out.println("Data fatched Succesfully..");
	}
	
	public void findByOrder(double amount)
	{
		 List<EntityClass> byorderAmount = jpaRepo.findByorderAmount(amount);
		System.out.println(byorderAmount);
		System.out.println("data fetched....");
	}
	

}
