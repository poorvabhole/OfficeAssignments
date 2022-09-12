package com.question.one;

import java.util.ArrayList;
import java.util.LinkedList;

public class EvenNumbers {
	ArrayList<Integer> A1;
	ArrayList<Integer> A2;

	public ArrayList<Integer> saveEvenNumbers(int N) {
		A1 = new ArrayList<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				A1.add(i);
			}
		}
		return A1;
	}

	public ArrayList<Integer> printEvenNumbers() {

		A2 = new ArrayList<Integer>();
		int num;
		for (int number : A1) {
			num = number * 2;
			A2.add(num);

		}
		//System.out.println(A2);
		return A2;
	}

	public int findNumber(int N) {
		for (int number : A1) {
			if (number == N) {
				return N;
			}
		}
		return 0;
	}

}
