package com.exilant.training.day004.observer;

//One which
public interface IObserveble {
	public void addUser(IObserver observer);
	public void remove(IObserver observer);
	//
	public void notifyObserver();

}
