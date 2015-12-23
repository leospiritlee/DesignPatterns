package com.design.pack.SimpleFactory;

public abstract class Operation {

	private double NumA = 0;
	private double NumB = 0;
	
	public abstract double GetResult();
	
	
	public double getNumA() {
		return NumA;
	}
	public void setNumA(double numA) {
		NumA = numA;
	}
	public double getNumB() {
		return NumB;
	}
	public void setNumB(double numB) {
		NumB = numB;
	}
	
	
	
	
}
