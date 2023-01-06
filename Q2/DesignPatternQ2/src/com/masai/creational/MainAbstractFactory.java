package com.masai.creational;

public class MainAbstractFactory {

	public static void main(String[] args) {
		
		// Abstract Factory Object
		MarutiFactory factory = new MarutiFactory("ZXI+", "DL2000", 2022, "Spacious");
		Vehicle maruti = VehicleFactoryV2.getVehicle(factory);
		carInstance(maruti);
		
		BMWFactory factory1 = new BMWFactory("XM", "DL2001", 2022, "Super Fast");
		Vehicle bmw = VehicleFactoryV2.getVehicle(factory1);
		carInstance(bmw);
		
		TataFactory factory2 = new TataFactory("XZA+", "DL2002", 2022, "Comfortable");
		Vehicle tata = VehicleFactoryV2.getVehicle(factory2);
		carInstance(tata);
	}
	
	public static void carInstance(Vehicle vehicle) {
		if(vehicle instanceof Maruti) {
			System.out.println("It is a car of Maruti");
			System.out.println(vehicle);
		}
		else if(vehicle instanceof BMW) {
			System.out.println("It is a car of BMW");
			System.out.println(vehicle);
		}
		else if(vehicle instanceof Tata) {
			System.out.println("It is a car of Tata");
			System.out.println(vehicle);

		}
	}

}
