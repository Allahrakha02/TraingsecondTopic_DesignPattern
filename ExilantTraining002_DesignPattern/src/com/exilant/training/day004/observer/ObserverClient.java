package com.exilant.training.day004.observer;

public class ObserverClient {
	
	public static void main(String[] args) {
		
		IObserveble observable= new OnePlus7TE();
		
		
		//IObserveble observable = null;
		IObserver user1= new User(observable, "kumar");
		IObserver user2= new User(observable, "pratap");
		
		observable.addUser(user1);
		observable.addUser(user2);
		
		observable.notifyObserver();
		
		
	}

}
