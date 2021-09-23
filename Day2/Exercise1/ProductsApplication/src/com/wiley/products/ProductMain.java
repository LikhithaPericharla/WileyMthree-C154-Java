package com.wiley.products;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Number : ");
		int productNumber = sc.nextInt();
		System.out.println("Enter Quantity : ");
		int quantitySold = sc.nextInt();
		
		Product product = new Product();
		product.setProductNumber(productNumber);
		product.setQuantitySold(quantitySold);
		
		product.display();
	}

}
