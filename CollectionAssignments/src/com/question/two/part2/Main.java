package com.question.two.part2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDBTreeSet db = new EmployeeDBTreeSet();
		
		int id;
		String payslip;
		
		EmployeeTreeset e1 = new EmployeeTreeset(1,"poorva","poorva@gmail.com","F",546.22f);
		EmployeeTreeset e2 = new EmployeeTreeset(2,"Manjula","manjula@gmail.com","F",89546.56f);
		EmployeeTreeset e3 = new EmployeeTreeset(3,"onkar","onkar@gmail.com","M",59836.6f);
		EmployeeTreeset e4 = new EmployeeTreeset(4,"Niketan","niketan@gmail.com","M",8453.00f);
		EmployeeTreeset e5 = new EmployeeTreeset(5,"sandesh","sandesh@gmail.com","M",1234.96f);
		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		db.addEmployee(e4);
		db.addEmployee(e5);

		
		System.out.println("Employee details are..");
		db.listAll();

		
		System.out.println("Enter employee Id to remove ");
		id = sc.nextInt();
		if(db.deleteEmployee(id)) {
			System.out.println("Employee is deleted..");
		}
		
		System.out.println("Enter employee Id to get pay slip ");
		id = sc.nextInt();
		payslip = db.showPaySlip((id));
		System.out.println(payslip);

	}
}
