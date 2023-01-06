package com.masai.creational;

public class VehicleFactory {

	public static Vehicle getVehicle(String type, String model, String regNo, int makeYear, String specialFeatures) {
		if ("Maruti".equalsIgnoreCase(type)) {
            return new Maruti(model, regNo, makeYear, specialFeatures);
        } else if ("BMW".equalsIgnoreCase(type)) {
            return new BMW(model, regNo, makeYear, specialFeatures);
        } else if ("Tata".equalsIgnoreCase(type)) {
            return new Tata(model, regNo, makeYear, specialFeatures);
        }
        return null;
	}
}
