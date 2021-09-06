package com.ultramain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import com.data.DataConnect;
import com.ultramain.dto.EmpDto;
import com.ultramain.util.Scan;
/**
 * @author Sangeethkumar
 *
 */
public class EmpDao {
	/**
	 * @throws SQLException
	 */
	/*public void viewEmployees() throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * FROM employee ORDER BY employee_id";
	    Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery(sqlQuery);
		
		int employee_id;
		String first_name;
		String last_name;
		float salary;
		long mobile;
		String department;
		
		while(rs.next()){
			employee_id = rs.getInt(1);
			first_name = rs.getString(2);
			last_name = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getLong(5);
			department = rs.getString(6);
			
			System.out.println("Employee_id: " + employee_id);
			System.out.println("First Name : " + first_name);
			System.out.println("Last Name  : " + last_name);
			System.out.println("Salary     : " + salary);
			System.out.println("Mobile     : " + mobile);
			System.out.println("Department : " +  department);
			System.out.println("----------------------------------");
		}
	} */
	public HashMap<Integer,EmpDto>viewAll() throws SQLException{
		HashMap<Integer,EmpDto>map=new HashMap();
		EmpDto empDto=null;
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * FROM employee ORDER BY employee_id";
	    Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery(sqlQuery);
		
		int employee_id;
		String first_name;
		String last_name;
		float salary;
		long mobile;
		String department;
		
		while(rs.next()){
			empDto=new EmpDto();
			employee_id = rs.getInt(1);
			empDto.setEmployeeId(employee_id);
			first_name = rs.getString(2);
			empDto.setFirstName(first_name);
			last_name = rs.getString(3);
			empDto.setLastName(last_name);
			salary = rs.getFloat(4);
			empDto.setSalary(salary);
			mobile = rs.getLong(5);
			empDto.setMobile(mobile);
			department = rs.getString(6);
			empDto.setDepartment(department);
			map.put(employee_id, empDto);
		}
		return map;
	}
	/**
	 * @param empDto
	 * @throws SQLException
	 */
	public void registerEmployee(EmpDto empDto) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		
		String sql = "INSERT INTO employee VALUES (?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmployeeId());
		pst.setString(2, empDto.getFirstName());
		pst.setString(3, empDto.getLastName());
		pst.setFloat(4, empDto.getSalary());
		pst.setLong(5, empDto.getMobile());
		pst.setString(6, empDto.getDepartment());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Updated : " + rowsUpdated);	
	}
	
	/**
	 * @param empDto
	 * @throws SQLException
	 */
	
	public void deleteEmployee(EmpDto empDto) throws SQLException{
		Connection con=DataConnect.getDbConnection();
		String sql="DELETE FROM employee where employee_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmployeeId());
		int rowsAffected=pst.executeUpdate();
	   System.out.println("Rows deleted :"+rowsAffected);
		
	}
	
    /**
     * @param empDto
     * @throws SQLException
     */
	
    public void updateEmployee(EmpDto empDto) throws SQLException{
		Connection con=DataConnect.getDbConnection();
		System.out.println("Enter new employee id :");
		String sql="UPDATE employee SET employee_id="+Scan.getScannerInstance().nextInt()+"where employee_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmployeeId());
		int rowsAffected=pst.executeUpdate();
		System.out.println("Rows updated :"+rowsAffected);
	}  
    
}
