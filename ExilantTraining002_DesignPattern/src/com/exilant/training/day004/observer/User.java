package com.exilant.training.day004.observer;



public class User implements IObserver{
	private IObserveble observable= null;
	private String name;
	
	

	public User(IObserveble observable, String name) {
		this.observable = observable;
		this.name = name;
	}

	public void byOnemobile() {
		System.out.println("hey i have bought One pLus^T by"+name);
	}


	
	public void UnSubscribe() {
		observable.remove(this);
	}

	@Override
	public void update() {
		
		byOnemobile();
		
	}

}
