package com.um21.employee;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		getData();
	}
	public static void getData() {
		Scanner sc=new Scanner(System.in);
		EmployeeServices es=new EmployeeServices();
		System.out.println("1.Add data");
		System.out.println("2.view data");
		System.out.print("enter choice :");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			es.getDetails(es.myobject());
			break;
		
		default:
			System.out.println("invalid");
		}
		getData();
		
	}
}
