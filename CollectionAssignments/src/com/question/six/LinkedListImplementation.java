package com.question.six;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenNumbers1 evenNumber = new EvenNumbers1();
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		int inputNum;
		
		System.out.println("Enter number ");
		inputNum = sc.nextInt();
		
		list1 = evenNumber.saveEvenNumbers(inputNum);
		System.out.println("List of even number upto range "+inputNum+" is "+list1+" "+list1.getFirst());
		
		list2 = evenNumber.printEvenNumbers();
		System.out.println("List after multiplying each even number "+list2);

		int number1 = evenNumber.findNumber(inputNum);
		if(number1 == inputNum) {
			System.out.println("Number is present");
		}
		else {
			System.out.println("Number is not present");
		}
		
	}


}
