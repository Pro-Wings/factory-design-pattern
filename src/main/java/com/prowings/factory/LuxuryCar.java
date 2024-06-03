package com.prowings.factory;

public class LuxuryCar extends Car{

	LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car!!!");
		System.out.println("installing ventilated seats!!!");
		//add luxury accessories
	}

}
