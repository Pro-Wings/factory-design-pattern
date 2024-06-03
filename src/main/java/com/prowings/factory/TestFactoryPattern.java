package com.prowings.factory;

public class TestFactoryPattern {
	
	
	public static void main(String[] args) {
		
			Car smallCar = CarFactory.buildCar(CarType.SMALL);
			System.out.println(smallCar);

			Car sedanCar = CarFactory.buildCar(CarType.SEDAN);
			System.out.println(sedanCar);

			Car luxuryCar = CarFactory.buildCar(CarType.LUXURY);
			System.out.println(luxuryCar);
		
	}

}
