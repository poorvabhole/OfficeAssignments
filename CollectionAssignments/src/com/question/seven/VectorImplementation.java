package com.question.seven;

import java.util.Scanner;
import java.util.Vector;


public class VectorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		VectorEvenNumbers evenNumber = new VectorEvenNumbers();
		
		Vector<Integer> list1 = new Vector<Integer>();
		Vector<Integer> list2 = new Vector<Integer>();
		
		int inputNum;
		
		System.out.println("Enter number ");
		inputNum = sc.nextInt();
		
		list1 = evenNumber.saveEvenNumbers(inputNum);
		System.out.println("List of even number upto range "+inputNum+" is "+list1);
		
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
