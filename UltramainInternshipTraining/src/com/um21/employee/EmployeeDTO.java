package com.um21.employee;

public class EmployeeDTO {
	private int Emp_Id;
	private String Emp_firstName;
	private String Emp_lastName;
	private double Salary;
	private String designation;
	
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public String getEmp_firstName() {
		return Emp_firstName;
	}
	public void setEmp_firstName(String emp_firstName) {
		Emp_firstName = emp_firstName;
	}
	public String getEmp_lastName() {
		return Emp_lastName;
	}
	public void setEmp_lastName(String emp_lastName) {
		Emp_lastName = emp_lastName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
