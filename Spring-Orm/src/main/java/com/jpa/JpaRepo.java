package com.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entiry.EntityClass;


@Repository
public interface JpaRepo extends CrudRepository<EntityClass, Integer>
{
 
	List<EntityClass> findByorderAmount(double d);
}
