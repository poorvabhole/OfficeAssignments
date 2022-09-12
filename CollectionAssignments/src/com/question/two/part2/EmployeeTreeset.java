package com.question.two.part2;

public class EmployeeTreeset implements Comparable<EmployeeTreeset> {
	Integer empId;
	String empName;
	String empEmail;
	String empGender;
	Float empSalary;
	public EmployeeTreeset(Integer empId, String empName, String empEmail, String empGender, Float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	@Override
	public int compareTo(EmployeeTreeset e) {
		
		return this.empId.compareTo(e.empId);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empGender="
				+ empGender + ", empSalary=" + empSalary + "]";
	}
	
	

}
