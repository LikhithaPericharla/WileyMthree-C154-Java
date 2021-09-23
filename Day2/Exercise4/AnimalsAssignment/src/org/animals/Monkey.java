package org.animals;

public class Monkey {
	private String name = "Monkey";
	private String color = "Brown";
	private int weight = 50;
	private int age = 30;
	
	public boolean isVegetarian() {
		return true;
	}
	
	public boolean canClimb() {
		return true;
	}
	
	public String sound() {
		return "chatter" ;
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
