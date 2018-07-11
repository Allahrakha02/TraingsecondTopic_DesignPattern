package com.exilant.training.day003.controller;

import com.exilant.training.day003.singleton.Employee;
import com.exilant.training.day003.singleton.SingleTon;

public class SingleTonClient {
	
	
	public static void main(String[] args) {
		
		
		
		SingleTon singleton=SingleTon.getInstance();
		
		Employee emp= new Employee();
		emp.employeeId=101;
		emp.employeeNAme="Ankot";
		
		System.out.println(emp);
		Employee emp2= new Employee();
		emp2.employeeId=102;
		emp2.employeeNAme="Akshy";

		System.out.println(emp2);
		
	}

}
