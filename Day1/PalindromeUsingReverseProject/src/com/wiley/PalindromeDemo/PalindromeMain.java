package com.wiley.PalindromeDemo;


public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		palindrome.setNumber(131);
		if(palindrome.isStatus() == true)
			System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is not a palindrome");
	}

}
