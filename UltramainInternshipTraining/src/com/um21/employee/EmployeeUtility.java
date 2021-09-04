package com.um21.employee;
import java.util.*;

public class EmployeeUtility {
	private static Scanner sc;
	private EmployeeUtility() {}
	public static Scanner getScanner() {
		if(sc==null) {
			sc=new Scanner(System.in);
		}
		return sc;
	}
}
