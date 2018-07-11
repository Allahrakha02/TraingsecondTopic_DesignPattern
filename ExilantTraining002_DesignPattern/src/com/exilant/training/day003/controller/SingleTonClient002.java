package com.exilant.training.day003.controller;

class Company{
	
	private Company() {
		System.out.println("Constructor Called...");
	}
	
	public static Company getInstance(Company company) {
		if(company==null) {
			return new Company();
		}
		return company;
		
	}
}



public class SingleTonClient002 {
	public static void main(String[] args) {
		
		
		
		Company company= null;
		company=Company.getInstance(company);
	}

}
