package com.infogalaxy.employee;

import java.util.Scanner;

import com.infogalaxy.employee.model.EmployeeModel;

public class EmployeeMain {

	EmployeeModel employeeModel = new EmployeeModel();
	
	public void setEmployee() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Employee ID:");
		employeeModel.setEid(scanner.nextInt());
		System.out.println("Enter the Employee Name:");
		employeeModel.setEname(scanner.next());
		System.out.println("Enter the Employee Mobile No:");
		employeeModel.setMobileNo(scanner.next());
		System.out.println("Enter the Employee Salary");
		employeeModel.setSalary(scanner.nextDouble());
	}
	
	public void getEmployee() {
		System.out.println("Employee ID:"+employeeModel.getEid());
		System.out.println("Employee Name:"+employeeModel.getEname());
		System.out.println("Employee Mobile No:"+employeeModel.getMobileNo());
		System.out.println("Employee Salary:"+employeeModel.getSalary());
	}
	
	public static void main(String[] args) {
		EmployeeMain employeeMain = new EmployeeMain();
		employeeMain.setEmployee();
		employeeMain.getEmployee();
	}

}
