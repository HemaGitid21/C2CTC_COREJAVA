package com.tnsif.mallproject;
import java.util.ArrayList;
public class Shop {
	private String name;
	private ArrayList<Product>products;
    public Shop(String name) {
    	this.name=name;
    	this.products=new ArrayList<>();
    }
    public void addProduct(Product product) {
    	products.add(product);
    }
	public void displayProducts() {
		System.out.println("Products in"+name +":");
		for(Product product:products) {
			System.out.println(product.getName()+":$"+product.getPrice());
		}
		
	}

}
