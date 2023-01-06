package com.masai.creational;

public abstract class Vehicle {

	public abstract String getModel();
    public abstract int getMakeYear();
    public abstract String getRegNo();
    public abstract String getSpecialFeatures();
    
	@Override
	public String toString() {
		return "Model- " + getModel() + ", Make Year- " + getMakeYear() + ", Reg. No.- " + getRegNo()
				+ ", Special Features- " + getSpecialFeatures();
	}

}
