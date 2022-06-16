package com.h2kinfosys.spring2;

public class Employee {
	
	public Employee() {
		System.out.println("Employee Constructor");
	}
	
	public void init() {
		System.out.println("Making sure emp exists in registry");
	}
	
	private String empId;
	private String empName;

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void destroy() {
		System.out.println("Destoy Employee");
	}

	
}
