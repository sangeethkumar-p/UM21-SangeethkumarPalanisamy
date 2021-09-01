package com.ultramain.um21.basics;

public class Laptop {
	private String model;
	private String companyName;
	private String ramSize;
	private String processerType;
	private int purchaseYear;
	public Laptop() {
		
	}
	public Laptop(String model, String companyName, String ramSize, String processerType, int purchaseYear) {
		this.model = model;
		this.companyName = companyName;
		this.ramSize = ramSize;
		this.processerType = processerType;
		this.purchaseYear = purchaseYear;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public String getProcesserType() {
		return processerType;
	}
	public void setProcesserType(String processerType) {
		this.processerType = processerType;
	}
	public int getPurchaseYear() {
		return purchaseYear;
	}
	public void setPurchaseYear(int purchaseYear) {
		this.purchaseYear = purchaseYear;
	}
	
}
	
	
	

