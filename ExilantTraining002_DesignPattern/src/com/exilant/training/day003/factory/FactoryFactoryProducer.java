package com.exilant.training.day003.factory;

public class FactoryFactoryProducer {
	
	// if this methos is not make as static every time it will create a new instance
	
	
	public static AbstructFactory getFActory(String factoryName) {
		if(factoryName.equals("vehicle")) {
			return new VehicleFActory();
		}
		else if(factoryName.equals("color")) {
			return new ColorFactory();
		}
		
		return null;
		
	}

}
