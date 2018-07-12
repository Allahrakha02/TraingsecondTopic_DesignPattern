package com.exilant.training.day004.observer;

import java.util.ArrayList;
import java.util.List;

public class OnePlus6TE implements IObserveble {

	private List<IObserver> user;
	private boolean isArrived = true;

	public OnePlus6TE() {
		this.user = new ArrayList<>();
	}

	@Override
	public void addUser(IObserver observer) {

	}

	public boolean isArrived() {
		return isArrived;
	}

	@Override
	public void remove(IObserver observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObserver() {

		for (IObserver temp : user) {
			temp.update();
		}

	}

	public void etArrived(boolean isArrived) {
		this.isArrived = isArrived;
		notifyObserver();
	}

}
