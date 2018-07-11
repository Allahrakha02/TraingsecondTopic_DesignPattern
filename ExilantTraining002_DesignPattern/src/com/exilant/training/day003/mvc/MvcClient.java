package com.exilant.training.day003.mvc;

public class MvcClient {
	
	public static void main(String[] args) {
		Employee employee= new Employee(10, "Allahrakha");
		
		StarView view= new StarView();
		EmployeeController controller= new EmployeeController(employee,view);
		controller.upDataeView("star");
	}

}
