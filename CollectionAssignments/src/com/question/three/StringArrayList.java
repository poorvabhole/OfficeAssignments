package com.question.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Poorva");
		list.add("Onkar");
		list.add("Niketan");
		list.add("Stephnie");
		list.add("Manjula");
		
		printAll(list);
	}
	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
