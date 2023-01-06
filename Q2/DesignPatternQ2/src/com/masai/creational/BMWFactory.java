package com.masai.creational;

public class BMWFactory implements VehicleAbstractFactory {

	private String model;
    private String regNo;
    private int makeYear;
    private String specialFeatures;
    
    
	
	public BMWFactory(String model, String regNo, int makeYear, String specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}



	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new BMW(model,regNo,makeYear,specialFeatures);
	}

}
