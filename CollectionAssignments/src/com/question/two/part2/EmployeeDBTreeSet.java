package com.question.two.part2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.question.two.Employee;

public class EmployeeDBTreeSet {
	Set<EmployeeTreeset> treeset = new TreeSet<EmployeeTreeset>();

	public boolean addEmployee(EmployeeTreeset emp) {
		this.treeset.add(emp);
		return true;
	}

	public boolean deleteEmployee(Integer empId) {
		Iterator<EmployeeTreeset> it = treeset.iterator();
		EmployeeTreeset employee;
		while (it.hasNext()) {
			employee = it.next();
			if (employee.getEmpId() == empId) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public String showPaySlip(Integer empId) {
		String payslip = "Invalid input";

		for (EmployeeTreeset emp : treeset) {
			if (emp.getEmpId() == empId) {
				return "Payslip of employee, Id --> " + empId + " is --> " + emp.getEmpSalary();
			}
		}
		return payslip;
	}

	public void listAll() {
		for (EmployeeTreeset e : treeset) { 
			System.out.println(e);
		}

	}

}
