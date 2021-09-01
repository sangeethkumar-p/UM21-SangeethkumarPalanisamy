package com.ultramain.um21.basics;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop();
		laptop.setModel("Macbook Pro");
		laptop.setCompanyName("Apple");
		laptop.setProcesserType("Hexacore intel i7");
		laptop.setRamSize("16GB");
		laptop.setPurchaseYear(2019);
		Display lap = new Display();
		lap.displayDetails(laptop);

	}

}
