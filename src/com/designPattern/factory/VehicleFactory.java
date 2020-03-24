package com.designPattern.factory;

public class VehicleFactory {
	private static Vehicle obj=null;
	public static Vehicle getInstance(String vehicleType) {
		if(vehicleType.equalsIgnoreCase("car")) {
			obj=new Car();
		}else if(vehicleType.equalsIgnoreCase("bus")) {
			obj=new Bus();
		}else if(vehicleType.equalsIgnoreCase("bike")) {
			obj=new Bike();
		}
		return obj;
	}
}
