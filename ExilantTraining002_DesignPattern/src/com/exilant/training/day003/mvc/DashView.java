package com.exilant.training.day003.mvc;

public class DashView {
	public static void printEmployee(Employee employee) {
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Employee Name :"+employee.getEmployeeName());
		System.out.println("---------------------------------------------------------------------------------");
	}
}
