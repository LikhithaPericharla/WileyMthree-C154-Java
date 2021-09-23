package com.wiley.employee;

public class Employee {
	private String empName;
	private int empId;
	private int empAge;
	private String empdesgn;
	private String empLocation;
	private int empExpInYrs;
	
	Employee(String name){
		empName = name;	
	}
	
	Employee(String name, int id){
		empName = name;	
		empId = id;
	}
	
	Employee(String name, int id, int age){
		empName = name;	
		empAge = age;
		empId = id;
	}
	
	Employee(String name, int id, String designation){
		empName = name;	
		empId = id;
		empdesgn = designation;
	}
	
	Employee(String name, int id, int age, String designation){
		empName = name;	
		empId = id;
		empAge = age;
		empdesgn = designation;
	}
	
	Employee(int age, String name, int id, String location){
		empAge = age;
		empName = name;	
		empId = id;
		empLocation = location;
		
	}
	
	Employee(String name, int id, int age, int exp){
		empName = name;	
		empId = id;
		empAge = age;
		empExpInYrs = exp;
	}
	
	Employee(String name, int id, String designation, int exp){
		empName = name;	
		empId = id;
		empdesgn = designation;
		empExpInYrs = exp;
	}
	
	Employee(String name, int id, String designation, String location, int exp){
		empName = name;	
		empId = id;
		empdesgn = designation;
		empLocation = location;
		empExpInYrs = exp;
	}
	
	Employee(String name, int id, int age, String designation, String location, int exp){
		empName = name;	
		empId = id;
		empAge = age;
		empdesgn = designation;
		empLocation = location;
		empExpInYrs = exp;
	}
	
	
	
	
}
