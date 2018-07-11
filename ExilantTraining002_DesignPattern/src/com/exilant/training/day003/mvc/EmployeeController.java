package com.exilant.training.day003.mvc;

public class EmployeeController {

	private Employee model;
	private StarView starView;
	//private DashView dashView;
	public Employee getModel() {
		return model;
	}
	public void setEmployee(Employee model) {
		this.model = model;
	}
	public StarView getStarView() {
		return starView;
	}
	public void setStarView(StarView starView) {
		this.starView = starView;
	}
	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeController(Employee model, StarView starView) {
		super();
		this.model = model;
		this.starView = starView;
	}
	
	public void upDataeView(String viewType) {
		System.out.println("Showinh "+viewType+" "+" view");
		starView.printEmployee(model);
	}
	
	
	
	
	
}
