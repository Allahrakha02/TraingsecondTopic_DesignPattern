package com.exilant.training.day003.factory;

public interface Ivehicle {
	
	void maove();
	void speed(int maxSpeed);

}
class ACar implements Ivehicle{

	@Override
	public void maove() {
		System.out.println("Car is Moving...");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Car  Speed is ..."+maxSpeed);
		
	}
	
}
class Truck implements Ivehicle,IColor{

	@Override
	public void maove() {
		System.out.println("Truck is Moving...");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Truck  Speed is ..."+maxSpeed);
		
	}

	@Override
	public void printCar() {
		System.out.println("Color is paint");
		
	}
	
}