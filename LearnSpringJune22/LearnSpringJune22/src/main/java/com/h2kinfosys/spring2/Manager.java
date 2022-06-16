package com.h2kinfosys.spring2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean{
	
	private String empId;
	private String deptName;
	
	public Manager() {
		System.out.println("Manager Constructor");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Manager afterPropertiesSet");
	}
	
	public void destroy() throws Exception {
		System.out.println("Manager Destroy");
		
	}
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
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	
	
	

}
