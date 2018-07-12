package com.exilant.training.day004.controller;

import com.exilant.training.day004.bridgepattern.RedColor;
import com.exilant.training.day004.bridgepattern.Shape;
import com.exilant.training.day004.bridgepattern.Tringle;

public class ShapeController {

	public static void main(String[] args) {
		Shape tringle= new Tringle(new RedColor());
		tringle.applyColor();
	}
}
