package com.question.two;

public class Employee {
	int empId;
	String empName;
	String empEmail;
	char empGender;
	float empSalary;

	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
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


	public char getEmpGender() {
		return empGender;
	}


	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}


	public float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}


	public void getEmployeeDetails() {

		System.out.println("Id :" + empId + "\n Name :" + empName + "\n Email :" + empEmail + "\n Gender :" + empGender
				+ "\n salary :" + empSalary);
	}


}
