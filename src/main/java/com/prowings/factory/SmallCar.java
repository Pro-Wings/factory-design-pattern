package com.prowings.factory;

public class SmallCar extends Car{

	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Small car!!!");
		//add small car accessories
	}

}
