package com.tnsif.mallproject;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Mall mall=new Mall("Royal Mall");
		//create shops
		Shop clothingShop=new Shop("Trenndy Clothinng");
		Shop electronicShop=new Shop("Electronic Hubs");
		Shop icecreamShop=new Shop("Variety Of IceCreams");
		Shop foodShop=new Shop("Diferent kind Of Foods and Snacks");
		//add Shops in mall
		mall.addShop(clothingShop);
		mall.addShop(electronicShop);
		mall.addShop(icecreamShop);
		mall.addShop(foodShop);
		// create products and prices
		Product shirts=new Product("T-shirts,300");
		Product pants=new Product("Jeans,700");
		Product mobiles=new Product("Smartphones,10000");
		Product laptops=new Product("Laptops,50000");
		Product chacolate=new Product("ChacolateIceCream,50");
		Product strawberry=new Product("StraBerryIceCream,60");
		Product briyani=new Product("Briyani,200");
		Product friedmomos=new Product("FriedChickenMomos,100");
		
       
		
	
		
		
		

		
		
	
	}

}
