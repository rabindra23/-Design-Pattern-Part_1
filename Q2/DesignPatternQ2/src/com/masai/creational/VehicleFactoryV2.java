package com.masai.creational;

public class VehicleFactoryV2 {

	public static Vehicle getVehicle(VehicleAbstractFactory factory) {
		return factory.createVehicle();
	}
}
