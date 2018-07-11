package com.exilant.training.day003.factory;

public class ClientFActory {

	
	public static void main(String[] args) {
	/*	AbstructFactory abf= FactoryFactoryProducer.getFActory("vehicle");
		Ivehicle fordCar=abf.getVehicle("acar");
		fordCar.maove();
		fordCar.speed(200);
		Ivehicle mainTruck=abf.getVehicle("truck");
		mainTruck.maove();
		mainTruck.speed(45);
		IColor redColor=FactoryFactoryProducer.getFActory("color").getColor("red");
		IColor redColor1=abf.getColor("blue"); 
		*/
		
		
		
		AbstructFactory abf2=FactoryFactoryProducer.getFActory("vehicle");
		Ivehicle iv2=abf2.getVehicle("truck");
		IColor ic=abf2.getColor("blue");
		iv2.maove();
		iv2.speed(200);
		
		

	}
	
	
	
}
