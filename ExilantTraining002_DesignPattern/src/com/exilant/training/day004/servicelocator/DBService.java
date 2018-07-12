package com.exilant.training.day004.servicelocator;

public class DBService  implements Service{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "db";
	}

	@Override
	public void execute() {
		

		System.out.println("We are executing DB Service..");
		
	}

}
