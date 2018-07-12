package com.exilant.training.day004.servicelocator;

public class ERPService implements Service{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "erp";
	}

	@Override
	public void execute() {
		System.out.println("Executing ERP Service");
		
	}

}
