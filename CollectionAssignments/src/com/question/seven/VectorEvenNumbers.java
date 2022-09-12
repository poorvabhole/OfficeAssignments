package com.question.seven;

import java.util.Vector;

public class VectorEvenNumbers {
	Vector<Integer> A1;
	Vector<Integer> A2;

	public Vector<Integer> saveEvenNumbers(int N) {
		A1 = new Vector<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				A1.add(i);
			}
		}
		return A1;
	}

	public Vector<Integer> printEvenNumbers() {

		A2 = new Vector<Integer>();
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
