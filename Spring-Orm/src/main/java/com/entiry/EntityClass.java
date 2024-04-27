package com.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Flipkart")
public class EntityClass 
{
	@Id
	private Integer userId;
	private String userName;
	private Double orderAmount;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	@Override
	public String toString() {
		return "EntityClass [userId=" + userId + ", userName=" + userName + ", orderAmount=" + orderAmount + "]";
	}
	
	
	
	
	

}
