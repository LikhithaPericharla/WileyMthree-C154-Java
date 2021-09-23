package org.animals;

public class Giraffe {
	private String name = "Giraffe";
	private String color = "Yellow";
	private int weight = 50;
	private int age = 25;
	
	public boolean isVegetarian() {
		return true;
	}
	
	public boolean canClimb() {
		return false;
	}
	
	public String sound() {
		return "bleat" ;
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
