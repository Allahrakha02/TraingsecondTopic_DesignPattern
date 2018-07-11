package com.exilant.training.day003.controller;

import com.exilant.training.day003.factory.Car;
import com.exilant.training.day003.factory.CarName;

public class FactoryClient001 {
	
	public static void main(String[] args) {
		
		Car car = Car.getCar(CarName.AUDI);
		car.drive();
	}

}
