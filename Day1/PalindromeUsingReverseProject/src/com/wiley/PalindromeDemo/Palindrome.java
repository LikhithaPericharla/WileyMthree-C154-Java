package com.wiley.PalindromeDemo;

import com.wiley.ReverseDemo.Reverse;

public class Palindrome {

	private int number;
	private boolean status;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isStatus() {
		Reverse rev = new Reverse();
		rev.setNumber(number);
		if( number == rev.getReverseNo()) {
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}
}
