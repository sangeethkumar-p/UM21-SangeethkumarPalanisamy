package com.Arrays;

import java.util.Scanner;
import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Employees :");
		int n=sc.nextInt();
		Employee employee[]=new Employee[n];
		ArrayList<Employee>emp=new ArrayList<Employee>();
		for(int i=0;i<n;i++) {
			emp.add(new Employee());
			employee[i]=emp.get(i);
			System.out.print("Id : ");
			employee[i].setEmpId(sc.nextInt());
			System.out.print("First Name : ");
			employee[i].setFirst_name(sc.next());
			System.out.print("Last Name : ");
			employee[i].setLast_name(sc.next());
			System.out.print("Salary : ");
			employee[i].setSalary(sc.nextDouble());
			System.out.print("Department : ");
			employee[i].setDept(sc.next());
		}
		getEmployeeDetails(employee);
	}
	public static void getEmployeeDetails(Employee employee[]) {
		for(int i=0;i<employee.length;i++) {
			System.out.println("Employee Id           : "+employee[i].getEmpId());
			System.out.println("Employee First Name   : "+employee[i].getFirst_name());
			System.out.println("Employee Last Name    : "+employee[i].getLast_name());
			System.out.println("Employee salary       : "+employee[i].getSalary());
			System.out.println("Department of Employee: "+employee[i].getDept());
	        System.out.println("-------------------------------------------------------");
		}
		
	}
}
