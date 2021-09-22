package com.wiley.ReverseDemo;

public class Reverse {

	private int number, reverseNo=0;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverseNo() {
		reverseNumber();
		return reverseNo;
	}	
	
	public void reverseNumber() {
		int reminder;
		while(number != 0) {
			reminder = number % 10;
			reverseNo = reverseNo * 10 + reminder;
			number = number/10;
		}
	}
}
