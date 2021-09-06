package com.ultramain.business;
import java.sql.SQLException;
import java.util.*;
import com.ultramain.dao.EmpDao;
import com.ultramain.dto.EmpDto;
import com.ultramain.util.Scan;

/**
 * @author Sangeethkumar
 *
 */
public class EmployeeBO {
	public void empSystem(){
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmpDao dao = new EmpDao();
		do{
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. Remove Employee ");
			System.out.println("4. Update Employee");
			System.out.println("5. Search Employee by employeeId");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
			System.out.println("---------------------------------");
		}while(choice==0);
		
		switch(choice){
		case 1:
	//		viewEmployees(dao);
			viewAll(dao);
			break;
		case 2:
			registerEmployee(dao);
			break;
		case 3:
			deleteEmployee(dao);
			break;
		case 4:
			updateEmployee(dao);
			break;
		case 5:
			System.out.println("Enter id :");
			int search=Scan.getScannerInstance().nextInt();
			viewSpecific(dao,search);
			break;
		case 6:
			return;
		}
		empSystem();
	}
	
  /*	public void viewEmployees(EmpDao dao){
		try {
		    dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	
	}  */
	public void viewAll(EmpDao dao) {
		try {
			HashMap<Integer,EmpDto>map=new HashMap();
			map.putAll(dao.viewAll());
			Set<Map.Entry<Integer, EmpDto>>entrySet=map.entrySet();
			EmpDto dto=new EmpDto();
			for(Map.Entry<Integer, EmpDto>entry:entrySet) {
				System.out.println("EmployeeId:"+entry.getValue().getEmployeeId());
				System.out.println("First_name:"+entry.getValue().getFirstName());
				System.out.println("Last_name :"+entry.getValue().getLastName());
				System.out.println("Salary    :"+entry.getValue().getSalary());
				System.out.println("Mobile    :"+entry.getValue().getMobile());
				System.out.println("Department:"+entry.getValue().getDepartment());
				System.out.println("--------------------------------");
				
			}
		}catch(SQLException e) {
			return ;
			
		}
	}
	public void viewSpecific(EmpDao dao,int id) {
		try {
			HashMap<Integer,EmpDto>map=new HashMap();
			map.putAll(dao.viewAll());
			Set<Map.Entry<Integer, EmpDto>>entrySet=map.entrySet();
			for(Map.Entry<Integer, EmpDto>entry:entrySet) {
				if(entry.getKey()==id) {
					System.out.println("EmployeeId:"+entry.getValue().getEmployeeId());
					System.out.println("first_name:"+entry.getValue().getFirstName());
					System.out.println("last_name :"+entry.getValue().getLastName());
					System.out.println("Salary    :"+entry.getValue().getSalary());
					System.out.println("mobile    :"+entry.getValue().getMobile());
					System.out.println("Department:"+entry.getValue().getDepartment());
					System.out.println("--------------------------------");
				}
			}
		}catch(SQLException e) {
			return;
		}
	}
	public void registerEmployee(EmpDao dao){
		System.out.println("How many employees registered? ");
		int n=Scan.getScannerInstance().nextInt();
		ArrayList<EmpDto>empDto=new ArrayList<EmpDto>();
		empDto = getEmpDetails(n);
		for(int i=0;i<n;i++) {
			try {
				dao.registerEmployee(empDto.get(i));
			
			} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		}
	}
	private void deleteEmployee(EmpDao empDao) {
		try {
		Scanner scan=Scan.getScannerInstance();
		System.out.println("Enter Employee id to delete :");
		int id=scan.nextInt();
		EmpDto dto=new EmpDto();
		dto.setEmployeeId(id);
		empDao.deleteEmployee(dto);
		}catch(SQLException e) {
			return;
		}    
		
	} 
	private void updateEmployee(EmpDao empDao) {
	try {
		Scanner scan=Scan.getScannerInstance();
		System.out.println("Enter EmployeeId to update:");
		int id=scan.nextInt();
		EmpDto dto=new EmpDto();
		dto.setEmployeeId(id);
		empDao.updateEmployee(dto);
		}catch(SQLException e) {
			return;
		}      
	} 
	
	
	/**
	 * @param n
	 * @return
	 */
	private ArrayList<EmpDto>getEmpDetails(int n){
	    Scanner scan=Scan.getScannerInstance();
		ArrayList<EmpDto>dto=new ArrayList();
		for(int i=0;i<n;i++) {
			dto.add(new EmpDto());
			System.out.println("Enter Employee Id: ");
            dto.get(i).setEmployeeId(scan.nextInt());
			System.out.println("Enter First Name : ");
			dto.get(i).setFirstName(scan.next());
			System.out.println("Enter Last Name : ");
			dto.get(i).setLastName(scan.next());
			System.out.println("Enter Salary : ");
			dto.get(i).setSalary(scan.nextFloat());
			System.out.println("Enter Mobile : ");
			dto.get(i).setMobile(scan.nextLong());
			System.out.println("Enter Department : ");
			dto.get(i).setDepartment(scan.next());		
			
		}
		return dto;
	}

}

