package com.masai.creational;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = VehicleFactory.getVehicle("Maruti","ZXI+", "DL2000", 2022, "Spacious");
		System.out.println(vehicle1);
		carInstance(vehicle1);
		
		Vehicle vehicle2 = VehicleFactory.getVehicle("BMW","XM", "DL2001", 2022, "Super Fast");
		System.out.println(vehicle2);
		carInstance(vehicle2);
		
		Vehicle vehicle3 = VehicleFactory.getVehicle("Tata","XZA+", "DL2002", 2022, "Comfortable");
		System.out.println(vehicle3);
		carInstance(vehicle3);
		
	}
	
	public static void carInstance(Vehicle vehicle) {
		if(vehicle instanceof Maruti) {
			System.out.println("It is a car of Maruti");
		}
		else if(vehicle instanceof BMW) {
			System.out.println("It is a car of BMW");
		}
		else if(vehicle instanceof Tata) {
			System.out.println("It is a car of Tata");

		}
	}

}
