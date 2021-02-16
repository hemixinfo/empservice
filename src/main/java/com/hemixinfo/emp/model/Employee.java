package com.hemixinfo.emp.model;

public class Employee {
	
	private String empId;
	
	private String empName;
	
	private String empDept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}



	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	

}
