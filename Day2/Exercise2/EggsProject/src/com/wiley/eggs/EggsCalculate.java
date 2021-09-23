package com.wiley.eggs;

public class EggsCalculate {
	
	private int totalEggs;
	private Eggs eggs;
	
	public EggsCalculate(int totalEggs) {
		super();
		this.totalEggs = totalEggs;
	}

	public int getTotalEggs() {
		return totalEggs;
	}

	public void setTotalEggs(int totalEggs) {
		this.totalEggs = totalEggs;
	}

	public Eggs getEggs() {
		return eggs;
	}

	public void setEggs(Eggs eggs) {
		this.eggs = eggs;
	}
	
	private int gross, dozen, eggsRemaining;
	
	public void calculate() {
				
		gross = totalEggs / 144;
		
		totalEggs = totalEggs % 144;
		
		dozen = (totalEggs) / 12;
		
		totalEggs = totalEggs % 12;
		
		eggsRemaining = totalEggs;
		
	}
	
	public void display() {
		calculate();
		System.out.println("No of eggs = " + gross + " gross " + dozen + " dozen " + eggsRemaining + " eggs left" );
	}
	
}
