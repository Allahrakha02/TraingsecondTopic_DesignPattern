package com.exilant.training.day004.bridgepattern;

//This shall be treated as Abstract Color
//Since the reference of the colorrrrrrrrrrrrrr is kept heree
public abstract class Shape {
	private CColor color;

	public CColor getColor() {
		return color;
	}
	public void setColor(CColor color) {
		this.color = color;
	}
	public Shape(CColor color) {
		this.color = color;
	}
	public abstract void applyColor();
}
