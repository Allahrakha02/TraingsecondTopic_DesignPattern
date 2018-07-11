package com.exilant.training.day003.singleton;

public class Employee {
	public int employeeId;
	public String employeeNAme;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeNAme() {
		return employeeNAme;
	}
	public void setEmployeeNAme(String employeeNAme) {
		this.employeeNAme = employeeNAme;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeNAme) {
		super();
		this.employeeId = employeeId;
		this.employeeNAme = employeeNAme;
	}
	
	
	

}
