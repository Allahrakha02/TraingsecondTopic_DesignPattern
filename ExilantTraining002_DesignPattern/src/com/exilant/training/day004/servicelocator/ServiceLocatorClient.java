package com.exilant.training.day004.servicelocator;

public class ServiceLocatorClient {
	
	public static void main(String[] args) {
		Service dbService= ServiceLocator.getService("db");
		dbService.execute();
		
		Service erpService= ServiceLocator.getService("erp");
		erpService.execute();
		System.out.println("***************");
		 dbService= ServiceLocator.getService("db");
		dbService.execute();
	}

}
