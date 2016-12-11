package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

	public static void main(String[] args) {
		List list = new ArrayList();

		Student s1 = new Student(20, "abc");
		Student s2 = new Student(16, "xyz");
		Student s3 = new Student(27, "pqr");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
	}

}

class Student implements Comparable {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int compareTo(Object paramT) {
		Student s = (Student) paramT;
		return (this.age - s.age);
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}