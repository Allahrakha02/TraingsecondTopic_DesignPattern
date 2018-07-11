package com.exilant.training.day003.factory;

public class VehicleFActory  extends AbstructFactory{

	@Override
	public Ivehicle getVehicle(String vehicle) {
		if(vehicle.equals("acar")) {
			return new ACar();
		}else if(vehicle.equals("truck")) {
			return new Truck();
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if(color.equals("red")) {
			return new Red();
		}else if(color.equals("blue")) {
			return new Blue();
		}
		return null;
	}

}
