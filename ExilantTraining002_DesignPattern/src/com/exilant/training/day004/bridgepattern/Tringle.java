package com.exilant.training.day004.bridgepattern;

public class Tringle extends Shape
{

	public Tringle(CColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		
System.out.println("Shape Tringle is color for "+getColor());
getColor().applyColor();
		
	}

}
