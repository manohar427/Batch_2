package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetManager {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add(13);
		hset.add(103);
		hset.add(13);
		hset.add(13);
		hset.add(13);
		hset.add(13);
		hset.add(130);
		hset.add("Abc");

		System.out.println(hset);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(13);
		lhs.add(103);
		lhs.add(13);
		lhs.add(13);
		lhs.add(13);
		lhs.add(13);
		lhs.add(130);
		lhs.add("Abc");
		System.out.println(lhs);
		//3.
		TreeSet tset = new TreeSet();
		tset.add(13);
		tset.add(103);
		tset.add(143);
		tset.add(13);
		tset.add(13);
		tset.add(13);
		tset.add(130);
		//tset.add("Abc");
		
		System.out.println(tset);
		
		TreeSet stset = new TreeSet();
		stset.add("xyz");
		stset.add("a");
		stset.add("ty");
		stset.add("wr");
		
		
		System.out.println(stset);
		
	}
}

