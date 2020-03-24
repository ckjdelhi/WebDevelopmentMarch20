package com.designPattern.factory;

public class Test {

	public static void main(String[] args) {
		
		Vehicle obj1=VehicleFactory.getInstance("car");
		obj1.wheels();
		obj1.doors();
		obj1.show();
		
		Vehicle obj2=VehicleFactory.getInstance("bus");
		obj2.wheels();
		obj2.doors();
		obj2.show();
		
		Vehicle obj3=VehicleFactory.getInstance("bike");
		obj3.wheels();
		obj3.doors();
		obj3.show();

	}

}
