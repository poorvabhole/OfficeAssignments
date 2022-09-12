package com.question.eight;

import java.util.Iterator;
import java.util.Vector;

public class VectorImpliment {

	public static void main(String[] args) {
		Vector<VectorEmployee> list = new Vector<>();

		list.add(new VectorEmployee(101, "Onkar", "123 Yavalmal, India", 20500.0));
		list.add(new VectorEmployee(102, "Poorva", "234 dhule, India", 30000.65));
		list.add(new VectorEmployee(103, "Manjula", "345 solapur, India", 25000.0));
		list.add(new VectorEmployee(104, "Niketan", "456 satara, India", 40000.30));

		Iterator<VectorEmployee> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
