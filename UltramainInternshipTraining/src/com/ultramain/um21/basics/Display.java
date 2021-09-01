package com.ultramain.um21.basics;

public class Display {
	public void displayDetails(Laptop mylaptop) {
		System.out.println("Model        :"+mylaptop.getModel());
		System.out.println("Company Name : "+mylaptop.getCompanyName());
		System.out.println("Processor    : "+mylaptop.getProcesserType());
		System.out.println("Ram Size     : "+mylaptop.getRamSize());
		System.out.println("purchase year: "+mylaptop.getPurchaseYear());
	}

}
