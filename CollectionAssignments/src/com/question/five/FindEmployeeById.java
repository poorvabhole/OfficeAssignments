package com.question.five;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindEmployeeById {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(101, "Onkar", "123 Yavalmal, India", 20000.0));
		empList.add(new Employee(102, "Poorva", "234 dhule, India", 30000.0));
		empList.add(new Employee(103, "Manjula", "345 solapur, India", 25000.0));
		empList.add(new Employee(104, "Niketan", "456 satara, India", 40000.0));

		int id = 101;
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.empId == id) {
				System.out.println(emp);
			}
		}
	}

}
