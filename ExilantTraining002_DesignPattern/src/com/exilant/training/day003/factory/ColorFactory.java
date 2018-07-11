 package com.exilant.training.day003.factory;

 //This class working like also as Adapter Design PAttern
public class ColorFactory extends AbstructFactory{

	@Override
	public Ivehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
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
