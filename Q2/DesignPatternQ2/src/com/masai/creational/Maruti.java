package com.masai.creational;

public class Maruti extends Vehicle{

	private String model;
	private String regNo;
	private int makeYear;
	private String specialFeatures;
	
	public Maruti(String model, String regNo, int makeYear, String specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public int getMakeYear() {
		// TODO Auto-generated method stub
		return makeYear;
	}

	@Override
	public String getRegNo() {
		// TODO Auto-generated method stub
		return regNo;
	}

	@Override
	public String getSpecialFeatures() {
		// TODO Auto-generated method stub
		return specialFeatures;
	}
	 
	 
}
