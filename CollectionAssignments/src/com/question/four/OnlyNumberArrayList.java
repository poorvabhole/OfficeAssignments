package com.question.four;

import java.util.ArrayList;
import java.util.List;

public class OnlyNumberArrayList {

	public static void main(String args[]) {

		List<Number> al = new ArrayList<Number>();

		// al.add("poorva");
		al.add(32.0f);
		al.add(7);
		al.add(0.07);
		for (Number element : al) {
			System.out.println(element + "\n");
		}
	}
}
