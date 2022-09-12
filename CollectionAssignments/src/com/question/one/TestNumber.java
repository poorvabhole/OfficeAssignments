package com.question.one;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenNumbers evenNumber = new EvenNumbers();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
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
