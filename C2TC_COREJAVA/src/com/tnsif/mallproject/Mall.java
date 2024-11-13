package com.tnsif.mallproject;
import java.util.ArrayList;
public class Mall {
	private String name;
	private ArrayList<Shop>shops;
    public Mall(String name) {
    	this.name=name;
    	this.shops=new ArrayList<>();
    }
    public void addShop(Shop shop) {
    	shop.add(shop);
    }
	public void displayShops() {
		System.out.println("Shops in"+name +":");
		for(Shop shop:shops) {
			System.out.println(shop.getName());
		}
		
	}

}

	