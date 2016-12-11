package com.jdk.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList<String>(); list.add("Asdkjasd");
		 * list.add("A"); list.add(12); list.add(12.90); list.add('I');
		 * 
		 * List<A> list1 = new ArrayList<A>(); list1.add(new A());
		 * list1.add("O");
		 */

		List<A> list2 = new ArrayList<A>();
		list2.add(new A());
		list2.add(new A());
		list2.add(new A());
		//list2.add("O");

		for (int i = 0; i < list2.size(); i++) {
			A ob = list2.get(i);
		}

	}

}

class A {

}