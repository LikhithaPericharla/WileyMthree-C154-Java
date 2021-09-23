package org.animals;

public class Tiger {
	private String name = "Tiger";
	private String color = "White";
	private int weight = 60;
	private int age = 20;
	
	public boolean isVegetarian() {
		return false;
	}
	
	public boolean canClimb() {
		return false;
	}
	
	public String sound() {
		return "growl" ;
	}
	
	public void characteristics() {
		System.out.println(name +" characteristics: ");
		System.out.println("Animal : " + name);
		System.out.println("Color : " + color);
		System.out.println("Weight : " + weight);
		System.out.println("Age : " + age);
		System.out.println("Is " + name + " a Vegetarian : " + isVegetarian());
		System.out.println("Can " + name + " climb : " + canClimb());
		System.out.println(name + "'s sound: " + sound());
	}
}
