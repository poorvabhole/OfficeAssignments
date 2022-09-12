package com.question.six;

import java.util.LinkedList;

public class EvenNumbers1 {
	LinkedList<Integer> A1;
	LinkedList<Integer> A2;

	public LinkedList<Integer> saveEvenNumbers(int N) {
		A1 = new LinkedList<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				A1.addFirst(i);
			}
		}
		return A1;
	}

	public LinkedList<Integer> printEvenNumbers() {

		A2 = new LinkedList<Integer>();
		int num;
		for (int number : A1) {
			num = number * 2;
			A2.addFirst(num);

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
