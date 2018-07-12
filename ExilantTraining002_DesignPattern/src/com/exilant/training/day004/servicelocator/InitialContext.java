package com.exilant.training.day004.servicelocator;

//this class will work for any Service
public class InitialContext {

	public Object lookuo(String jndiName) {
		
		if(jndiName.equalsIgnoreCase("db")) {
			System.out.println("looking for DB Service and Creating ");
			return new DBService();
		}else if(jndiName.equalsIgnoreCase("erp")) {
			System.out.println("looking for ERP Service and Creating ");
			return new ERPService();
		}
		return null;
	}
	
}
