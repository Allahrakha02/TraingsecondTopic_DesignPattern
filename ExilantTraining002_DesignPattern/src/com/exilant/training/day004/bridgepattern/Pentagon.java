package com.exilant.training.day004.bridgepattern;

public class Pentagon extends Shape {

	public Pentagon(CColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Shape Pentagon is color for "+getColor().toString());
		getColor().applyColor();
	}

}
