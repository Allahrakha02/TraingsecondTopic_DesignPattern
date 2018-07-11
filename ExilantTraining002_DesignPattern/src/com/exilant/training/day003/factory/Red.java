package com.exilant.training.day003.factory;

public class Red implements IColor {

	@Override
	public void printCar() {
		System.out.println("Car painting color is Red");
		
	}

}
class Blue implements IColor {

	@Override
	public void printCar() {
		System.out.println("Car painting color is Blue");
		
	}

}
