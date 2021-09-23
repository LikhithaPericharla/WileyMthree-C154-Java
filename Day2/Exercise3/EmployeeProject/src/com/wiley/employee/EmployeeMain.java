package com.wiley.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Likhitha");
		Employee emp2 = new Employee("Likhitha", 154);
		Employee emp3 = new Employee("Likhitha", 154, 21);
		Employee emp4 = new Employee("Likhitha", 154, "Trainee" );
		Employee emp5 = new Employee("Likhitha", 154, 21, "Trainee");
		
		Employee emp6 = new Employee(21,"Likhitha", 154, "AP");
		
		Employee emp7 = new Employee("Likhitha", 154, 21, 1);
		Employee emp8 = new Employee("Likhitha", 154, "Trainee", 1);
		Employee emp9 = new Employee("Likhitha", 154, "Trainee", "AP", 1);
		Employee emp10 = new Employee("Likhitha", 154, 21, "Trainee", "AP", 1);

	}

}
