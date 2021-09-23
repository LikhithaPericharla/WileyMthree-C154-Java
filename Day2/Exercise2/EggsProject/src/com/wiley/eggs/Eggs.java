package com.wiley.eggs;

public class Eggs {
	private int eggs;
	private int gross;
	private int dozen;
	private int eggsRemaining;
	
	public int getEggs() {
		return eggs;
	}
	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	public int getGross() {
		return gross;
	}
	public void setGross(int gross) {
		this.gross = gross;
	}
	public int getDozen() {
		return dozen;
	}
	public void setDozen(int dozen) {
		this.dozen = dozen;
	}
	public int getEggsRemaining() {
		return eggsRemaining;
	}
	public void setEggsRemaining(int eggsRemaining) {
		this.eggsRemaining = eggsRemaining;
	}
	public Eggs(int gross, int dozen, int eggsRemaining) {
		super();
		this.gross = gross;
		this.dozen = dozen;
		this.eggsRemaining = eggsRemaining;
	}
	
	
}
