package com.um21.employee;
import java.util.*;

public class EmployeeServices {
	ArrayList<EmployeeDTO> list=new ArrayList();
	public ArrayList<EmployeeDTO> myobject(){
		ArrayList<EmployeeDTO>object=new ArrayList();
		Scanner sc=EmployeeUtility.getScanner();
		System.out.print("How many employees are registered? =>");		
		int number=sc.nextInt();
		for(int i=0;i<number;i++) {
			object.add(new EmployeeDTO());
			EmployeeDTO dto=object.get(i);
			System.out.println("Enter details for employee :"+(i+1));
			System.out.print("Enter Id              :");
			dto.setEmp_Id(sc.nextInt());
			System.out.print("Enter first name      :");
            dto.setEmp_firstName(sc.next());
			System.out.print("Enter last name       :");
			dto.setEmp_lastName(sc.next());
			System.out.print("Enter salary          :");
			dto.setSalary(sc.nextDouble());
			System.out.print("Enter designation     :");
			dto.setDesignation(sc.next());
			System.out.println("=================================================");
		    list.add(dto);
		    }
		return object;
		
	}
	public void getDetails(ArrayList<EmployeeDTO>object) {
		for(int i=0;i<object.size();i++) {
			EmployeeDTO dto=object.get(i);
			System.out.println("Details of the Employee :"+(i+1));
			System.out.println("Employee Id             :"+dto.getEmp_Id());
			System.out.println("Employee first name     :"+dto.getEmp_firstName());
			System.out.println("Employee last name      :"+dto.getEmp_lastName());
			System.out.println("Employee Salary         :"+dto.getSalary());
			System.out.println("Employee designation    :"+dto.getDesignation());
            System.out.println("==================================================");
			
		}
	}
}
