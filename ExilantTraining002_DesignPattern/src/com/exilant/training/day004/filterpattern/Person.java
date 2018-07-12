package com.exilant.training.day004.filterpattern;

public class Person {
	private String name;
	private String sex;
	private String matrialStatus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMatrialStatus() {
		return matrialStatus;
	}
	public void setMatrialStatus(String matrialStatus) {
		this.matrialStatus = matrialStatus;
	}
	public Person(String name, String sex, String matrialStatus) {
		super();
		this.name = name;
		this.sex = sex;
		this.matrialStatus = matrialStatus;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", matrialStatus=" + matrialStatus + "]";
	}
	
	

}
