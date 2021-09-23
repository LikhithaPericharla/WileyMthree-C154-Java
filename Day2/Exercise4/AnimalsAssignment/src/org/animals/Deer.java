package org.animals;

public class Deer {
	private String name = "Deer";
	private String color = "Brown";
	private int weight = 30;
	private int age = 10;
	
	public boolean isVegetarian() {
		return true;
	}
	
	public boolean canClimb() {
		return false;
	}
	
	public String sound() {
		return "bell" ;
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
