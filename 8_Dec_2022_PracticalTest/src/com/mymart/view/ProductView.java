package com.mymart.view;
import java.util.LinkedList;
import com.mymart.model.Product;
import com.mymart.service.ProductService;
public class ProductView {
	private static ProductService productService=new ProductService();
	public void addProduct() {
		int pId=1;
		String pName="hp Laptop";
		double pPrice=65000;
		Product product=new Product(pId,pName,pPrice);
		productService.addProductService(product);
	}
	public void displayAllProducts() {
		LinkedList<Product>product=productService.getAllProductsService();
		for(Product p:product) {
			System.out.println("Product Details:");
			System.out.println("Product ID:"+p.getProductId());
			System.out.println("Product Name:"+p.getProductName());
			System.out.println("Product Price:"+p.getProductPrice());
		}
		
		
	}


}
