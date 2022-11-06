package com.mystore.service;
import com.mystore.daopackage.ProductDAO;
import com.mystore.modelpackage.Product;
public class ProductService {
	{
		ProductDAO prodDAO=new ProductDAO();

		public void addProductService(Product product) {
			prodDAO.(product);
			
		}

		public Product[] getProductByNameStartWithService(String s) {
			Product[] prodArr3=prodDAO.getProductByNameStartWith(s);   
			return prodArr3;
		}

		public Product[] getAllProducts() {
			Product prodArr4[]=prodDAO.getAllProducts();  
			return prodArr4;
		

        }
    }
}

