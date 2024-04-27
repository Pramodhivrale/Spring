package com.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;



@Configuration
@EnableJpaRepositories("com.jpa")
public class FlipkartJpaConfiguration 
{
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/springbatch");
		datasource.setUsername("root");
		datasource.setPassword("Pramod#12");
		
		return (DataSource) datasource;
	}
	
	@Bean("entityManagerFactory")
	LocalContainerEntityManagerFactoryBean creatEntityManagerFactory()
	{
		LocalContainerEntityManagerFactoryBean bean=new
				LocalContainerEntityManagerFactoryBean();
		
		//Setting datasource object /db details
		bean.setDataSource((javax.sql.DataSource) getDataSource());
		
		//provide packge information of entity class
		bean.setPackagesToScan("com.*");
		
		//providing hibernate properties to entity manager
		bean.setJpaProperties(hibernateProperties());
		
		//passing perdefined adapter object to entity manager
	    HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
	    bean.setJpaVendorAdapter(adapter);
	    
	    return bean;
		
	}
	@Bean("transactionManager")
	public PlatformTransactionManager platformTransactionManager()
	{
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(creatEntityManagerFactory().getObject());
		return jpaTransactionManager;
	}
	
	Properties hibernateProperties()
	{
		Properties pop=new Properties();
		pop.setProperty("hibernate.hbm2ddl.auto","update");
		pop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		return pop;
	}
	

}
