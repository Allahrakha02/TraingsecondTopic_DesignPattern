package com.exilant.training.day004.facedpattern;

public class HatchPack implements F_Car {

	@Override
	public void drive() {
		System.out.println("Driving is good for small citys for families..");

	}

}

class SUV implements F_Car {

	@Override
	public void drive() {
		System.out.println("Good for Big city (SUV)");

	}

}

class Sedan implements F_Car {

	@Override
	public void drive() {
		System.out.println("Good for Long drive (Sedan)");

	}

}
