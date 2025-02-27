package com.prowings.factory;

public abstract class Car {

	private CarType model = null;

	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}

	private void arrangeParts() {
		// Do one time processing here
		System.out.println("Arranging parts for car!!");
	}

	// Do subclass level processing in this method
	protected abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

}
