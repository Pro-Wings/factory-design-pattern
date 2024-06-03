package com.prowings.factory;

public class SedanCar extends Car{

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Sedan car!!!");
		//add sedan accessories
	}

}
