package com.question.two;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDB db = new EmployeeDB();
		
		int id;
		String payslip;
		
		Employee e1 = new Employee(1,"poorva","poorva@gmail.com",'F',546.22f);
		Employee e2 = new Employee(2,"Manjula","manjula@gmail.com",'F',89546.56f);
		Employee e3 = new Employee(3,"onkar","onkar@gmail.com",'M',59836.6f);
		Employee e4 = new Employee(4,"Niketan","niketan@gmail.com",'M',8453.00f);
		Employee e5 = new Employee(5,"sandesh","sandesh@gmail.com",'M',1234.96f);
		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		db.addEmployee(e4);
		db.addEmployee(e5);
		
		
		System.out.println("Employee details are..");
		Employee[] array = db.listAll();
		for (int i = 0; i < array.length; i++) {
			array[i].getEmployeeDetails();
		}
		
//		System.out.println("Enter employee Id to remove ");
//		id = sc.nextInt();
//		if(db.deleteEmployee(id)) {
//			System.out.println("Employee is deleted..");
//		}
		
		System.out.println("Enter employee Id to get pay slip ");
		id = sc.nextInt();
		payslip = db.showPaySlip((id-1));
		System.out.println(payslip);

	}

}
