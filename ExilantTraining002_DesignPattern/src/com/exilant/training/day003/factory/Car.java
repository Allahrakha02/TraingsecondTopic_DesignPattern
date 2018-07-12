package com.exilant.training.day003.factory;

public class Car {
	
	
	public static Car getCar(CarName carName){
		if(carName==CarName.MARUTI) {
			return new MarutiCar();
		}else  if(carName==CarName.AUDI) {
			return new AudiCar();
		}else if(carName==CarName.BMW) {
			return new BmwCar();
		}
		return null;
	}

	public void drive() {
		// TODO Auto-generated method stub
		
	}

}
