package com.data;

import org.springframework.stereotype.Component;

@Component
public class Product
{
	private String productNAme;
	private int productId;
	
	public Product() {
      System.out.println("Product object crated");
	}

	public String getProductNAme() {
		return productNAme;
	}

	public void setProductNAme(String productNAme) {
		this.productNAme = productNAme;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	

}
