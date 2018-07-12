package com.exilant.training.day004.facedpattern;

public class FacedCar {
	private HatchPack hp;
	private Sedan sedan;
	private SUV suv;
	public FacedCar() {
	
		this.hp = new HatchPack();
		this.sedan =new Sedan();
		this.suv = new SUV();
	}
	
	public void hatchBAckDriver() {
		hp.drive();
	}
	public void seadanBAckDriver() {
		sedan.drive();
	}
	public void suvBAckDriver() {
		suv.drive();
	}

}
