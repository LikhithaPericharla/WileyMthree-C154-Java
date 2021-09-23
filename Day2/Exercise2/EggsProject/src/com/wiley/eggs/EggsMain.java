package com.wiley.eggs;

import java.util.Scanner;

public class EggsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of eggs : ");
		int eggs = sc.nextInt();
				
		EggsCalculate calculate = new EggsCalculate(eggs);
		
		calculate.display();
		

	}

}
