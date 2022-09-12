package com.question.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {

	List<Employee> list = new ArrayList<Employee>();
	// Enumeration<Employee> employeeEnumeration = Collections.enumeration(list);

	public boolean addEmployee(Employee emp) {
		this.list.add(emp);
		return true;
	}

	public boolean deleteEmployee(int empId) {

//		for (int i = 0; i < list.size(); i++) {
//			Employee emp = list.get(i);
//
//			if (emp.empId == empId) {
//				System.out.println("Employeed deleted");
//				employeeEnumeration = Collections.enumeration(this.list);
//				return list.remove(emp);
//			}
//		}
		Iterator<Employee> it = list.iterator();

		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				it.remove();
				return true;
			}
		}

		return false;
	}

	public String showPaySlip(int empId) {
		float salary = list.get(empId).empSalary;
		return "salary is --> " + salary;
	}

//	public void displayAll() {
//		for (Employee emp : this.list) {
//			System.out.println(emp.empId);
//		}
//	}

	public Employee[] listAll() {
		Employee[] array = new Employee[list.size()];

		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}

}
