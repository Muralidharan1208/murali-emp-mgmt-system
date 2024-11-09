package com.murali.emp.mgmt.system.model;

public class Employee {

	private String nameString;
	private int empId;
	private String mailIdString;
	
	public Employee(String nameString, int empId, String mailIdString) {
		//super();
		this.nameString = nameString;
		this.empId = empId;
		this.mailIdString = mailIdString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getMailIdString() {
		return mailIdString;
	}

	public void setMailIdString(String mailIdString) {
		this.mailIdString = mailIdString;
	}


}
