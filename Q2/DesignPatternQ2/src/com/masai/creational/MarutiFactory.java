package com.masai.creational;

public class MarutiFactory implements VehicleAbstractFactory{

	private String model;
    private String regNo;
    private int makeYear;
    private String specialFeatures;
    
	public MarutiFactory(String model, String regNo, int makeYear, String specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}
    
	@Override
	public Vehicle createVehicle() {
		return new Maruti(model,regNo,makeYear,specialFeatures);
	}
    
}
