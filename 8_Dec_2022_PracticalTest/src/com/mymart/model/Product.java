package com.mymart.model;
import java.util.Objects;
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	public Product(int pId, String pName,double pPrice) {
		this.productId=pId;
		this.productName=pName;
		this.productPrice=pPrice;
	}
	
	
	public void setproductId(int pId) {
		productId=pId;
	}
	public void setproductName(String pName) {
		productName=pName;
	}
	public void setproductPrice(int pPrice) {
		productPrice=pPrice;
	}
	

	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	
	public String toString(){
		String text=productId+" "+productName+" "+productPrice;
		return text;
	}
@Override
public boolean equals( Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		Product other=(Product)obj;
			return false;
	}
	public int hashCode() {
		return Objects.hash(productId,productName,productPrice);
	}

}
